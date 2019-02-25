package com.dalberry.service;

import java.util.HashMap;

import com.dalberry.model.User;


public class UserMap {
	
	static HashMap<String, User> userMap = new HashMap<>();

    public static HashMap<String, User> creatUserMap(User user) {
		userMap.put(user.getUserMandatoryDetail().getEmail(), user);
		System.out.println("User Registered");
		System.out.println(userMap);
		return userMap;
	}
	
	public static HashMap<String,User> getUserMap() {
		return userMap;

	}


}
