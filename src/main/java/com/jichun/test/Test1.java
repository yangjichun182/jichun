package com.jichun.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jichun.domain.Employees;
import com.jichun.services.EpmService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application.xml" })
public class Test1 {
	@Autowired(required = true)
	EpmService service;

	@Test
	public void test1() {
		System.out.println("service:" + service);
		Employees emp = service.getEmp("100");
		String last_NAME = emp.getLAST_NAME();
		String first_NAME = emp.getFIRST_NAME();
		System.out.println(first_NAME + "==" + last_NAME);

	}

}
