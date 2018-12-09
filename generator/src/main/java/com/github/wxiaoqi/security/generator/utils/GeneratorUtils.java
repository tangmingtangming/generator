package com.github.wxiaoqi.security.generator.utils;

import com.github.wxiaoqi.security.generator.entity.ColumnEntity;
import com.github.wxiaoqi.security.generator.entity.TableEntity;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 代码生成器   工具类
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年12月19日 下午11:40:24
 */
public class GeneratorUtils {

    public static List<String> getTemplates() {
        List<String> templates = new ArrayList<String>();
       /* templates.add("template/index.js.vm");
        templates.add("template/index.vue.vm");
        templates.add("template/mapper.xml.vm");
        templates.add("template/biz.java.vm");
        templates.add("template/entity.java.vm");
        templates.add("template/mapper.java.vm");*/
        templates.add("template/Controller.java.vm");
        templates.add("template/list.html.vm");
        templates.add("template/Service.java.vm");
        templates.add("template/ServiceImpl.java.vm");
        templates.add("template/Model.java.vm");
        templates.add("template/Mapper.java.vm");
        templates.add("template/Mapper.xml.vm");
       
        return templates;
    }

    /**
     * 生成代码
     */
    public static void generatorCode(Map<String, String> table,
                                     List<Map<String, Object>> columns, ZipOutputStream zip) {
        //配置信息
        Configuration config = getConfig();

        //表信息
        TableEntity tableEntity = new TableEntity();
        tableEntity.setTableName(table.get("tableName"));
        tableEntity.setComments(table.get("tableComment"));
        //表名转换成Java类名
        String className = tableToJava(tableEntity.getTableName(), config.getString("tablePrefix"));
        tableEntity.setClassName(className);
        tableEntity.setClassname(StringUtils.uncapitalize(className));

        //列信息
        List<ColumnEntity> columsList = new ArrayList<>();
        for (Map<String, Object> column : columns) {
            ColumnEntity columnEntity = new ColumnEntity();
            columnEntity.setColumnName(column.get("columnName").toString());
            columnEntity.setDataType(column.get("dataType").toString());
            columnEntity.setComments(column.get("columnComment").toString());
            columnEntity.setExtra(column.get("extra").toString());

            //列名转换成Java属性名
            String attrName = columnToJava(columnEntity.getColumnName());
            columnEntity.setAttrName(attrName);
            columnEntity.setAttrname(StringUtils.uncapitalize(attrName));

            //列的数据类型，转换成Java类型
            String attrType = config.getString(columnEntity.getDataType(), "unknowType");
            columnEntity.setAttrType(attrType);

            //是否主键
            if ("PRI".equalsIgnoreCase((String) column.get("columnKey")) && tableEntity.getPk() == null) {
                tableEntity.setPk(columnEntity);
            }

            columsList.add(columnEntity);
        }
        tableEntity.setColumns(columsList);

        //没主键，则第一个字段为主键
        if (tableEntity.getPk() == null) {
            tableEntity.setPk(tableEntity.getColumns().get(0));
        }

        //设置velocity资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(prop);

        //封装模板数据
        Map<String, Object> map = new HashMap<>();
        map.put("tableName", tableEntity.getTableName());
        map.put("comments", tableEntity.getComments());
        map.put("pk", tableEntity.getPk());
        map.put("className", tableEntity.getClassName());
        map.put("classname", tableEntity.getClassname());
        map.put("pathName", tableEntity.getClassname().toLowerCase());
        map.put("columns", tableEntity.getColumns());
        map.put("package", config.getString("package"));
        map.put("author", config.getString("author"));
        map.put("email", config.getString("email"));
        map.put("datetime", DateUtils.format(new Date(), DateUtils.DATE_TIME_PATTERN));
        map.put("moduleName", config.getString("mainModule"));
        map.put("secondModuleName", toLowerCaseFirstOne(className));
        VelocityContext context = new VelocityContext(map);

        //获取模板列表
        List<String> templates = getTemplates();
        for (String template : templates) {
            //渲染模板
            StringWriter sw = new StringWriter();
            Template tpl = Velocity.getTemplate("", "UTF-8");
            tpl.merge(context, sw);

            try {
                //添加到zip
                zip.putNextEntry(new ZipEntry(getFileName(template, tableEntity.getClassName(), config.getString("package"), config.getString("mainModule"))));
                IOUtils.write(sw.toString(), zip, "UTF-8");
                IOUtils.closeQuietly(sw);
                zip.closeEntry();
            } catch (IOException e) {
                throw new RuntimeException("渲染模板失败，表名：" + tableEntity.getTableName(), e);
            }
        }
    }


  

    /**
     * 获取配置信息
     */
    public static Configuration getConfig() {
        try {
            return new PropertiesConfiguration("generator.properties");
        } catch (ConfigurationException e) {
            throw new RuntimeException("获取配置文件失败，", e);
        }
    }

    /**
     * 获取文件名
     */
    public static String getFileName(String template, String className, String packageName, String moduleName) {
        String packagePath = "main" + File.separator + "java" + File.separator;
        String frontPath = "ui" + File.separator;
        if (StringUtils.isNotBlank(packageName)) {
            packagePath += packageName.replace(".", File.separator) + File.separator;
        }
        
        if (template.contains("list.html.vm")) {
            return frontPath + "api" + File.separator + moduleName + File.separator + toLowerCaseFirstOne(className) + File.separator + "list.html";
        }
        if (template.contains("Service.java.vm")) {
            return frontPath + "api" + File.separator + moduleName + File.separator + toLowerCaseFirstOne(className) + File.separator + "Service.java";
        }
        if (template.contains("ServiceImpl.java.vm")) {
            return frontPath + "api" + File.separator + moduleName + File.separator + toLowerCaseFirstOne(className) + File.separator + "ServiceImpl.java";
        }
        if (template.contains("Model.java.vm")) {
            return frontPath + "api" + File.separator + moduleName + File.separator + toLowerCaseFirstOne(className) + File.separator + "Model.java";
        }
        if (template.contains("Controller.java.vm")) {
        	return packagePath + "rest" + File.separator + className + "Controller.java";
        }
        if (template.contains("Mapper.java.vm")) {
            return frontPath + "api" + File.separator + moduleName + File.separator + toLowerCaseFirstOne(className) + File.separator + "Mapper.java";
        }
        if (template.contains("Mapper.xml.vm")) {
        	return packagePath + "rest" + File.separator + className + "Mapper.xml";
        }
        
       /* if (template.contains("index.js.vm")) {
            return frontPath + "api" + File.separator + moduleName + File.separator + toLowerCaseFirstOne(className) + File.separator + "index.js";
        }
        

        if (template.contains("index.vue.vm")) {
            return frontPath + "views" + File.separator + moduleName + File.separator + toLowerCaseFirstOne(className) + File.separator + "index.vue";
        }

        if (template.contains("biz.java.vm")) {
            return packagePath + "biz" + File.separator + className + "Biz.java";
        }
        if (template.contains("mapper.java.vm")) {
            return packagePath + "mapper" + File.separator + className + "Mapper.java";
        }
        if (template.contains("entity.java.vm")) {
            return packagePath + "entity" + File.separator + className + ".java";
        }
        if (template.contains("mapper.xml.vm")) {
            return "main" + File.separator + "resources" + File.separator + "mapper" + File.separator + className + "Mapper.xml";
        }*/

        return null;
    }

    //首字母转小写
    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }
    /**
     * 列名转换成Java属性名
     */
    public static String columnToJava(String columnName) {
        return WordUtils.capitalizeFully(columnName, new char[]{'_'}).replace("_", "");
    }

    /**
     * 表名转换成Java类名
     */
    public static String tableToJava(String tableName, String tablePrefix) {
        if (StringUtils.isNotBlank(tablePrefix)) {
            tableName = tableName.replace(tablePrefix, "");
        }
        return columnToJava(tableName);
    }
    public static void main(String[] args) {
		String str = GeneratorUtils.columnToJava("aaa_vvv");
		String str1 = GeneratorUtils.tableToJava("aaa_vvv",null);
		
		System.out.println(str+"==="+str1);
	}
    
    /**
     * 生成代码
     */
    public static void generator(List<Map<String, Object>>  tables,
                                     List<Map<String, Object>> columnObjs, List<Map<String, Object>> authObjs,List<Map<String, Object>> formObjs,List<Map<String, Object>> urlObjs,String basePackage) {
        //配置信息
        Configuration config = getConfig();
        Map<String, Object> map = new HashMap<>();

        //表信息
        TableEntity tableEntity = new TableEntity();
        tableEntity.setTableName((String)tables.get(0).get("tableName"));
        tableEntity.setComments((String)tables.get(0).get("tableComment"));
        //表名转换成Java类名
        String className = tableToJava(tableEntity.getTableName(), config.getString("tablePrefix"));
        tableEntity.setClassName(className);
        tableEntity.setClassname(StringUtils.uncapitalize(className));

        //列信息
        List<ColumnEntity> columsList = new ArrayList<>();
        for (Map<String, Object> column : columnObjs) {
            ColumnEntity columnEntity = new ColumnEntity();
            columnEntity.setColumnName(column.get("columnName").toString());
            columnEntity.setDataType(column.get("dataType").toString());
            columnEntity.setComments(column.get("columnComment").toString());
            columnEntity.setExtra(column.get("extra").toString());

            //列名转换成Java属性名
            String attrName = columnToJava(columnEntity.getColumnName());
            columnEntity.setAttrName(attrName);
            columnEntity.setAttrname(StringUtils.uncapitalize(attrName));

            //列的数据类型，转换成Java类型
            String attrType = config.getString(columnEntity.getDataType(), "unknowType");
            columnEntity.setAttrType(attrType);

            //是否主键
            if ("PRI".equalsIgnoreCase((String) column.get("columnKey")) && tableEntity.getPk() == null) {
            	map.put("pk", column);
            	tableEntity.setPk(columnEntity);
            }

            columsList.add(columnEntity);
        }
        tableEntity.setColumns(columsList);

        //没主键，则第一个字段为主键
        if (tableEntity.getPk() == null) {
            tableEntity.setPk(tableEntity.getColumns().get(0));
        }

        //设置velocity资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(prop);

        //封装模板数据
        map.put("basePackage", basePackage);
        //表名
        map.put("tableName", tableEntity.getTableName());
        //驼峰 aaaBbbb
        map.put("tableNameA", toLowerCaseFirstOne(GeneratorUtils.columnToJava(tableEntity.getTableName())));
        //驼峰 AaaBbbb
        map.put("tableNameB", GeneratorUtils.columnToJava(tableEntity.getTableName()));
        map.put("comments", tableEntity.getComments());
        //map.put("pk", tableEntity.getPk());
        map.put("className", tableEntity.getClassName());
        map.put("classname", tableEntity.getClassname());
        map.put("pathName", tableEntity.getClassname().toLowerCase());
        map.put("columns", tableEntity.getColumns());
        //列表配置
        map.put("columnObjs", columnObjs);
        //功能权限配置
        map.put("authObjs", authObjs);
        //模态框配置
        map.put("formObjs", formObjs);
        
        map.put("package", config.getString("package"));
        map.put("author", config.getString("author"));
        map.put("email", config.getString("email"));
        map.put("datetime", DateUtils.format(new Date(), DateUtils.DATE_TIME_PATTERN));
        map.put("moduleName", config.getString("mainModule"));
        map.put("secondModuleName", toLowerCaseFirstOne(className));
        VelocityContext context = new VelocityContext(map);

        //获取模板列表
        List<String> templates = getTemplates();
        for (int i=0;i<urlObjs.size();i++) {
        	String template =(String) urlObjs.get(i).get("vmFile");
        	
            //渲染模板
            StringWriter sw = new StringWriter();
            Template tpl = Velocity.getTemplate(template, "UTF-8");
           // tpl.merge(context, sw);
            
            String ff=template.substring(0,template.lastIndexOf("."));
            String[] strs=ff.split("/");
            File file=null;
            String fileUrl=(String) urlObjs.get(i).get("fileUrl");
            file = new File(fileUrl.substring(0, fileUrl.lastIndexOf("/")),fileUrl.substring(fileUrl.lastIndexOf("/"),fileUrl.length()));
            //String filename="D:\\workspace\\springboot\\frommayun\\iplatform\\src\\main\\java\\cn\\aerotop\\iplatform\\test11";
           /* Map<String,String> m = new HashMap<>();
            m.put("Controller.java", "controller");
            m.put("Service.java", "service");
            m.put("ServiceImpl.java", "service/impl");
            m.put("Model.java", "model");
            m.put("Mapper.java", "repository");
            m.put("Mapper.xml", "repository");
            if(m.get(strs[1])==null){
            	//file = new File("D:\\workspace\\springboot\\frommayun\\iplatform\\src\\main\\resources\\templates\\test11", "/"+GeneratorUtils.columnToJava(tableEntity.getTableName())+strs[1]);
            }else{
            	if(strs.length==2)
            		file = new File(filename, m.get(strs[1])+"/"+GeneratorUtils.columnToJava(tableEntity.getTableName())+strs[1].replace("Model", ""));
            	else{
            		file = new File(filename, GeneratorUtils.columnToJava(tableEntity.getTableName())+template.substring(0,template.lastIndexOf(".")));
            	}
            }*/
            try {
	            if (!file.getParentFile().exists())
	                file.getParentFile().mkdirs();
	            if (!file.exists()){
	            	file.createNewFile();
	            }
 
	            FileOutputStream outStream = new FileOutputStream(file);
	            OutputStreamWriter writer = new OutputStreamWriter(outStream,
	                    "UTF-8");
	            BufferedWriter sws = new BufferedWriter(writer);
	            tpl.merge(context, sws);
	            /*Velocity.evaluate(context, sws, "", template.replaceAll(
	                    "[ ]*(#if|#else|#elseif|#end|#set|#foreach)", "$1")); 
	            */
	            sws.flush();
	            sws.close();
	            outStream.close();
	            
            } catch (IOException e) {
            	// TODO Auto-generated catch block
            	e.printStackTrace();
            }
        /*    try {
                //添加到zip
                zip.putNextEntry(new ZipEntry(getFileName(template, tableEntity.getClassName(), config.getString("package"), config.getString("mainModule"))));
                IOUtils.write(sw.toString(), zip, "UTF-8");
                IOUtils.closeQuietly(sw);
                zip.closeEntry();
            } catch (IOException e) {
                throw new RuntimeException("渲染模板失败，表名：" + tableEntity.getTableName(), e);
            }*/
        }
    }
}
