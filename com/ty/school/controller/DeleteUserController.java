package com.ty.school.controller;

import com.ty.school.dao.UserDao;

public class DeleteUserController {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		boolean flag = userDao.deleteUser(2);
		System.out.println(flag);
	}
}
