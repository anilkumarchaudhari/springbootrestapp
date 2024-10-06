
package com.my.app.springrestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {
	
	@Autowired
	DataService dataService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET )
	//@GetMapping("/user")
	public User getUser() {
		return dataService.getUserDetails();
	}
	
	@ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!1111";
    }
	
	
	
	@ResponseBody
    @RequestMapping("/get/user/info")
    public String getUserInfo() {
        return "Hello ABC";
    }
	
	//@PostMapping  -- Post method -- create user - request body -- status 201
	
	//@PutMapping -- put method -- update record --  request body
	
	//@DeleteMapping -- delete method -- delete a record --- no request body
	
}
