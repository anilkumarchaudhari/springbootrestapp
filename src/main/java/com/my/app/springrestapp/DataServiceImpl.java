package com.my.app.springrestapp;

import org.springframework.stereotype.Component;

@Component
public class DataServiceImpl implements DataService {

	@Override
	public User getUserDetails() {
		// TODO Auto-generated method stub
		 return new User(1,"Anil","Chaudhari");
	}

}
