/*
 * Copyright 2013 Primeton Technologies Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wxiaoqi.security.generator.utils;

/**
 * TODO 此处填写 class 信息
 *
 * @author fangwl (mailto:fangwl@primeton.com)
 */
public interface IAppConstants {
	     //通道
	   static final String TYPE_CHANNEL= "channel";
	     //终端设备
		static final String TYPE_DEVICE= "device";
	    //链路
		static final String TYPE_LINK= "link";
		//监测点
		static final String TYPE_POINT= "point";
		//参数组
		//static final String TYPE_PARAGROUP = "parametergroup";
		
		//参数
		//static final String TYPE_PARA = "parameter";
	
	//功能url
	 static final String FUNCTION_URL = "funcUrl";
	
	//是否认证
	static final String FUNCTION_IS_CHECK = "isCheck";
	
	//参数信息
	static final String FUNCTION_PARA_INFO = "paraInfo";
	
	//应用url
	static final String APP_URL = "appUrl";
	
	//应用编码
	static final String APP_CODE = "appCode";
	
	//组织结构根节点
	
	static final String ORGROOT_CODE = "orgrootcode";
	
	//组织机构
	static final String SYS_ORGANIZATION = "organization";
	
	//岗位
	static final String SYS_POSITION = "position";
	
	//员工
	static final String SYS_EMPLOYEE = "employee";
	
	//应用类型
	static final String TYPE_APPLICATION = "application";
	
	//功能组类型
	static final String TYPE_FUNCGROUP = "functiongroup";
	
	//子功能组类型
	static final String TYPE_SUBFUNCGROUP = "subfunctiongroup";
	
	//功能
	static final String TYPE_FUNCTION = "function";
	
	//应用功能树默认根节点
	static final String APP_TREE_ROOT = "应用功能树";
	
	//菜单树默认根节点
	static final String MENU_TREE_ROOT = "应用菜单树";
	
	//叶子节点菜单
	static final String TYPE_MENU = "menu";
	
	//非叶子节点菜单
	static final String TYPE_MENUGROUP = "menugroup";
}
