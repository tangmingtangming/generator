package com.github.wxiaoqi.security.generator.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
public class DataTypeUtil implements Serializable{
		private final static Map<String, Datatype>map= new HashMap<>();
		static{
			map.put("char", Datatype.CHAR);
			map.put("varchar", Datatype.varchar);
			map.put("tinyint", Datatype.TINYINT);
			map.put("smallint", Datatype.SMALLINT);
			map.put("int", Datatype.INT);
			map.put("float", Datatype.FLOAT);
			map.put("bigint", Datatype.BIGINT);
			map.put("double", Datatype.DOUBLE);
			map.put("bit", Datatype.BIT);
			map.put("time", Datatype.TIME);
			map.put("date", Datatype.DATE);
			map.put("timestamp", Datatype.TIMESTAMP);
			map.put("text", Datatype.TEXT);
			map.put("longtext", Datatype.LONGTEXT);
			map.put("datetime", Datatype.DATETIME);
			map.put("longblob", Datatype.LONGBLOB);
			map.put("blog", Datatype.BLOG);
			map.put("enum", Datatype.ENUM);
			map.put("set", Datatype.SET);
			map.put("decimal", Datatype.DECIMAL);
		}
		public static String getJavaType(String type) {
			System.out.println("-----"+type);
			//去空格转小写
			String lowerCase = type.replaceAll(" ", "").toLowerCase();
			Datatype datatype = map.get(lowerCase);
			return datatype.getJavaType();
		}
		public static String getJdbcType(String type) {
			String lowerCase = type.replaceAll(" ", "").toLowerCase();
			Datatype datatype = map.get(lowerCase);
			return datatype.getJdbcType();
		}
		private enum Datatype {
			CHAR("char", "CHAR","java.lang.String"),
			varchar("varchar", "VARCHAR","java.lang.String"),
			TINYINT("tinyint", "TINYINT","byte"),
			SMALLINT("smallint", "SMALLINT","short"),
			INT("int", "INTEGER","int"),
			FLOAT("float", "FLOAT","float"),
			BIGINT("bigint", "BIGINT","long"),
			DOUBLE("double", "DOUBLE","double"),
			BIT("bit", "BOOLEAN","boolean"),
			DATETIME("datetime", "TIMESTAMP","java.util.Date"),
			TIME("time", "TIME","java.util.Date"),
			DATE("date", "DATE","java.util.Date"),
			TIMESTAMP("timestamp", "TIMESTAMP","java.util.Date"),
			TEXT("text", "VARCHAR","java.lang.String"),
			LONGTEXT("longtext", "LONGVARCHAR","java.lang.String"),
			LONGBLOB("longblob", "LONGBLOB","byte[]"),
			BLOG("blog", "BLOG","byte[]"),
			ENUM("enum", "CHAR","java.lang.String"),
			SET("set", "CHAR","java.lang.String"),
			DECIMAL("decimal", "DECIMAL","java.math.BigDecimal");
			  private String mySQL;
			  private String jdbcType;
			  private String javaType;
			private Datatype() {
			}
			private Datatype(String mySQL, String jdbcType, String javaType) {
				this.mySQL = mySQL;
				this.jdbcType = jdbcType;
				this.javaType = javaType;
			}
			public String getMySQL() {
				return mySQL;
			}
			public void setMySQL(String mySQL) {
				this.mySQL = mySQL;
			}
			public String getJdbcType() {
				return jdbcType;
			}
			public void setJdbcType(String jdbcType) {
				this.jdbcType = jdbcType;
			}
			public String getJavaType() {
				return javaType;
			}
			public void setJavaType(String javaType) {
				this.javaType = javaType;
			}
		}
	}

