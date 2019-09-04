package com.jichun.controler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jichun.domain.Employees;
import com.jichun.services.EpmService;

@RequestMapping("/jsp/test")
@Controller
public class EmpController {
	@Autowired(required = true)
	private EpmService empService;

	// http://127.0.0.1:8080/jichun/jsp/test/emp.do?id=100
	@RequestMapping("/emp")
	public List<String> getEmp(String id, HttpServletRequest request) {
		List<String> list = new ArrayList<String>();
		Employees emp = empService.getEmp(id);
		System.out.println("emp:" + emp);
		String name = emp.getFIRST_NAME();
		String email = emp.getEMAIL();
		System.out.println(id + "--" + name);
//		list.put("name", name);
//		map.put("email", email);
		request.setAttribute("emp", emp);
		return list;
	}
}
