package com.ty.school.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class UpdateUserController {

	public static void main(String[] args) {
		User user = new User();
		UserDao userDao = new UserDao();
		user.setEmail("rajesh@gmail.com");
		user.setPassword("def000");
		user.setPhone(7456566140l);
		user.setGender("Male");
		User user2 = userDao.updateUser(user);
		System.out.println("User updated successfully!\nDetails of user :"+user2);
	}
}
