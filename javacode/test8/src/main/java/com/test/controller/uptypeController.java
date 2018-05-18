package com.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.uptype;
import com.test.service.uptypeService;

public class uptypeController {
	private uptypeService uptypeService;
	@RequestMapping(value = "findallUptypelist.do",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<uptype> findallTypelist(){
//		 Map<String,String> map=new HashMap<String, String>();
		 List<uptype> uptypelist = uptypeService.findAll();
		 if(uptypelist==null){
			 System.out.printf("\n....nouptype....\n");
//			 map.put("result","nouptype");	
		 }
		 else 
			{
//					 map.put("result","success");
//					 map.put("data","");
					
			}		 
		return uptypelist;
	}	
}
