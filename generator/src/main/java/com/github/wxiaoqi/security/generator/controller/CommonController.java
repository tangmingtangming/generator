package com.github.wxiaoqi.security.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CommonController {
	
	/**两层文件夹下的文件的跳转
	 * @param page
	 * @param ppage
	 * @return
	 */
	@RequestMapping(value="/generator/{page1}/{page2}")
	public String pageTwo(@PathVariable String page1,@PathVariable String page2){
		
		return page1+"/"+page2;
				
	}
	@RequestMapping(value="/generator/{page1}/{page2}/{page3}")
	public String pageThree(@PathVariable String page1,@PathVariable String page2,@PathVariable String page3){
		
		return page1+"/"+page2+"/"+page3;
				
	}
	@RequestMapping(value="/generator/{page}")
	public String page2(@PathVariable String page){
		
		return ""+page;
	}
	

}
