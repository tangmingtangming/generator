package com.github.wxiaoqi.security.generator.rest;

import com.alibaba.fastjson.JSON;
import com.github.wxiaoqi.security.common.msg.TableResultResponse;
import com.github.wxiaoqi.security.generator.service.GeneratorService;
import com.github.wxiaoqi.security.generator.utils.DataTypeUtil;
import com.github.wxiaoqi.security.generator.utils.GeneratorUtils;
import com.github.wxiaoqi.security.generator.utils.ResultUtil;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ace on 2017/8/25.
 */
@Controller
@RequestMapping("/base/generator")
public class GeneratorRest {

    @Autowired
    private GeneratorService generatorService;
    

    /**
     * 列表
     */
    @ResponseBody
    @RequestMapping("/page")
    public TableResultResponse<Map<String, Object>> list(@RequestParam Map<String, Object> params) {
        List<Map<String, Object>> result = generatorService.queryList(params);
        int total = generatorService.queryTotal(params);
        return new TableResultResponse<Map<String, Object>>(total, result);
    }

    /**
     * 生成代码
     */
    @RequestMapping("/code")
    public void code(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String[] tableNames = new String[]{};
        String tables = request.getParameter("tables");
        tableNames = JSON.parseArray(tables).toArray(tableNames);

        byte[] data = generatorService.generatorCode(tableNames);
        
        response.reset();
        response.setHeader("Content-Disposition", "attachment; filename=\"generator-code.zip\"");
        response.addHeader("Content-Length", "" + data.length);
        response.setContentType("application/octet-stream; charset=UTF-8");

        IOUtils.write(data, response.getOutputStream());
    }
    
    /**
     * 生成代码
     */
    @RequestMapping("/getColumn")
    @ResponseBody
    public ResultUtil getColumn(String t) throws IOException {
        String[] tableNames = new String[]{};
        tableNames = t.split(",");
        List<Map<String, Object>> columns=null;
        for(String tableName : tableNames){
			//查询表信息
			Map<String, String> table = generatorService.queryTable(tableName);
			//查询列信息
			columns = generatorService.queryColumns(tableName);
			for(Map<String, Object> o : columns){
				String cn = (String)o.get("columnName");
				o.put("columnName", GeneratorUtils.toLowerCaseFirstOne(GeneratorUtils.columnToJava(cn)));
			}
			
			//生成代码
			//GeneratorUtils.generatorCode(table, columns, zip);
		}
        return ResultUtil.build(200, "",columns);
    }
    /**
     * 列表
     */
    @ResponseBody
    @RequestMapping("/columnpage")
    public TableResultResponse<Map<String, Object>> columnList(@RequestParam Map<String, Object> params) {
    	String t=(String) params.get("tableName");
    	String[] tableNames = new String[]{};
        tableNames = t.split(",");
        List<Map<String, Object>> columns=null;
        for(String tableName : tableNames){
			//查询表信息
			Map<String, String> table = generatorService.queryTable(tableName);
			//查询列信息
			columns = generatorService.queryColumns(tableName);
			for(Map<String, Object> o : columns){
				String cn = (String)o.get("columnName");
				String dt = (String)o.get("dataType");
				o.put("dataType", dt.toUpperCase());
				o.put("jdbcType", DataTypeUtil.getJdbcType(dt.toUpperCase()));
				o.put("javaType", DataTypeUtil.getJavaType(dt.toUpperCase()));
				o.put("columnNameY", cn);
				o.put("columnName", GeneratorUtils.toLowerCaseFirstOne(GeneratorUtils.columnToJava(cn)));
				o.put("columnNameA", GeneratorUtils.columnToJava(cn));
			}
			//生成代码
			//GeneratorUtils.generatorCode(table, columns, zip);
		}
        int total = columns.size();
        return new TableResultResponse<Map<String, Object>>(total, columns);
    }
    
    /**
     * 生成代码
     */
	@RequestMapping("/gen")
	@ResponseBody
    public String gen( @RequestBody Map datas){
    	List<Map<String,Object>> tables = new ArrayList<Map<String,Object>>();
    	List<Map<String,Object>> columnObjs = new ArrayList<Map<String,Object>>();
    	List<Map<String,Object>> authObjs = new ArrayList<Map<String,Object>>();
    	List<Map<String,Object>> formObjs = new ArrayList<Map<String,Object>>();
    	List<Map<String,Object>> urlObjs = new ArrayList<Map<String,Object>>();
    	String basePackage=(String)datas.get("basePackage");
    	tables=(List<Map<String, Object>>) datas.get("tables");
    	columnObjs=(List<Map<String, Object>>) datas.get("columnObjs");
    	authObjs=(List<Map<String, Object>>) datas.get("authObjs");
    	formObjs=(List<Map<String, Object>>) datas.get("formObjs");
    	urlObjs=(List<Map<String, Object>>) datas.get("urlObjs");
    	GeneratorUtils.generator(tables, columnObjs, authObjs,formObjs,urlObjs,basePackage);
    	return null;
       
      //生成代码
		//GeneratorUtils.generatorCode(table, columns, zip);

       
    }
	
	
}
