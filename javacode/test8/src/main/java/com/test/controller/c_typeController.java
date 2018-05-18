package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.c_type;
import com.test.service.c_typeService;
@Controller
public class c_typeController {
	
	@Autowired
	private c_typeService c_typeService;
	
	@RequestMapping(value = "findTypeNameById.do",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Map<String,String> findTypeNameById(@RequestBody c_type u){
		 Map<String,String> map=new HashMap<String, String>();
		 c_type c_type = c_typeService.findByID(u.getTypeId());
		 if(c_type==null){
			 System.out.printf("\n....noc_type....\n");
			 map.put("result","noc_type");	
		 }
		 else 
			{
					 map.put("result","success");
					 map.put("typeName",""+c_type.getTypeName());
					 map.put("uptypeName",""+c_type.getUptype().getUptypeName());
					 System.out.println("\n\n"+c_type.toString()+"\n\n");
			}		 
		return map;
	}	
	@RequestMapping(value = "findallType.do",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Map<String,String> findallType(){
		 Map<String,String> map=new HashMap<String, String>();
		 List<c_type> c_typelist = c_typeService.findAll();
		 if(c_typelist==null){
			 System.out.printf("\n....noc_type....\n");
			 map.put("result","noc_type");	
		 }
		 else 
			{
					 map.put("result","success");
					 map.put("data","");
					
			}		 
		return map;
	}	
	@RequestMapping(value = "findallTypelist.do",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<c_type> findallTypelist(){
//		 Map<String,String> map=new HashMap<String, String>();
		 List<c_type> c_typelist = c_typeService.findAll();
		 if(c_typelist==null){
			 System.out.printf("\n....noc_type....\n");
//			 map.put("result","noc_type");	
		 }
		 else 
			{
//					 map.put("result","success");
//					 map.put("data","");
					
			}		 
		return c_typelist;
	}	
}
