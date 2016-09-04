package com.cn.snatch.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.snatch.dao.IUserDAO;
import com.cn.snatch.pojo.User;
import com.cn.snatch.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDAO  userDAO;
	
	@Override 
	public User getUserById (int userId) {
		return this.userDAO.selectByPrimaryKey(userId);
	}
}
