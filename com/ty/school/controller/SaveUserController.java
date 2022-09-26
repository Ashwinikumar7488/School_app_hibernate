package com.ty.school.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class SaveUserController {

	public static void main(String[] args) {
		User user = new User();
		UserDao userDao = new UserDao();
		user.setEmail("ashutosh46376@gmail.com");
		user.setPassword("def565");
		user.setPhone(7488566140l);
		user.setGender("Male");
		userDao.saveUser(user);
		System.out.println("User Saved Successfully!");
	}
}
