package com.ty.school.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class FindUserController {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		User user2 = userDao.findUser(5);
		System.out.println("User details are: "+user2);
	}
}