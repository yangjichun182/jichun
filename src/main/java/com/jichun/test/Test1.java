package com.jichun.test;

import com.jichun.domain.Employees;
import com.jichun.domain.User;
import com.jichun.services.EpmService;
import com.jichun.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application.xml" })
public class Test1 {
	@Autowired(required = true)
	EpmService service;

	@Autowired(required = true)
	private UserService service1;
	
	@Test
	public void testMain() {
		String str = "dfhfdjg";
		int indexOf = str.indexOf("h");
		System.out.println(indexOf);
	}


	@Test
	public void test1() {
		System.out.println("service:" + service);
		Employees emp = service.getEmp("100");
		String last_NAME = emp.getLAST_NAME();
		String first_NAME = emp.getFIRST_NAME();
		System.out.println(first_NAME + "==" + last_NAME);

	}

	@Test
	public void test_isnert() {
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String format2 = format.format(date);
		System.out.println("service:" + service);
		Employees emp = new Employees(1000, "Steven", "King", "SKING", "10086", "2019-09-10",
				"AD_PRES", 24000.00, 200.00, 10, 90);
		service.save(emp);
	}

	@Test
	public void test2() {
		System.out.println("service1:" + service1);
		String time = new Timestamp(System.currentTimeMillis()).toString();
		System.out.println(time);
		User user = new User("3", "123456", "1", time);
		// User user = new User("1",null,null,null);
		service1.insert_user(user);
	}
	
	@Test
	public void test_update_user(){
		service1.update_user_status("3");
	}

	
	@Test
	public void test_delete_user(){
		service1.delete_user("3");
	}
	
	@Test
	public void test_get_user(){
		User user = service1.get_User("3");
		System.out.println(user.getUser_password());
	}
	
	@Test
	public void test_jichun(){
		
	}


}
