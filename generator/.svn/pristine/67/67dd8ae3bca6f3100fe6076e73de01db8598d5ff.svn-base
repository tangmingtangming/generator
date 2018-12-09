package com.github.wxiaoqi.security.generator.utils;

import java.util.UUID;

public class UUIDUtil {
	
	 /**
	 * @return生成32位的uuid
	 */
	public static String getUUID() {
		 String uuid = UUID.randomUUID().toString();  
	        String[] strArray = uuid.split("\\s*[-]\\s*");  
	        StringBuffer sb = new StringBuffer();  
	        for(int i=0;i<strArray.length;i++){  
	            sb.append(strArray[i]);  
	        }  
	        uuid = sb.toString();  
	        return uuid;  
	    }
}
