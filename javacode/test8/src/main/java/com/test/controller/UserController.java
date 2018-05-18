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

import com.test.model.User;
import com.test.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "login.do",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Map<String,String> UserLogin(@RequestBody User u){
		 Map<String,String> map=new HashMap<String, String>();
		 User user = userService.findByName(u.getUsername());
		 if(user==null){
			 map.put("result","noUser");	
		 }
		 else 
			{
				if(user.getPassword().equals(u.getPassword()))
				{
					 map.put("result","success");
					 map.put("userId",""+user.getUserId());
					 map.put("phone",""+user.getPhone());
					 map.put("userName",user.getUsername());
					 map.put("email",user.getEmail());
					 map.put("userType",user.getUserType());
					 System.out.println("\n\n"+user.toString()+"\n\n");
				}
				else{
					map.put("result","Passworderror");
				}
			}		 
		return map;
	}
	
	@RequestMapping(value = "register.do",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Map<String,String> UserRegister(@RequestBody User u){
		 Map<String,String> map=new HashMap<String, String>();
		 User user = userService.findByName(u.getUsername());
		 if(user==null){
			 userService.addUser(u);
				map.put("result","success");
		 }
		 else {
			 map.put("result","failed");
			 System.out.println("\n\n用户已存在\n\n");
			}		 
		return map;
	}
	
	
	@RequestMapping(value = "findUserbyId.do",method={RequestMethod.GET,RequestMethod.POST})
	public  @ResponseBody List<User> findUserbyId(@RequestBody int c){
		 List<User> userlist = userService.findByID(c);
		if(userlist.size()>0) {
			userlist.get(0).setPassword("");
		}
		return userlist;
	}
	
}
