package com.cn.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.snatch.pojo.User;
import com.cn.snatch.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)    //表示继承了 SpringJUnit4ClassRunner类
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})

public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	//private ApplicationContext aContext = null;
	
	@Resource
	private IUserService userService = null;
	
//	@Before 
//	public void before() {
//		aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) aContext.getBean("userService");
//	}
//	
	@Test 
	public void test1() {
		User user = userService.getUserById(1);
		logger.info("值：" + user.getUserName());
		
	}
	
}
