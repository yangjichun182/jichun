package com.jichun.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jichun.domain.Student;
import com.jichun.services.StrudentService;

@RequestMapping("/jsp/test")
@Controller
public class StudentController {

	@Autowired
	private StrudentService service;

//	http://localhost:8080/jichun/jsp/test/student.do?id=001
	@RequestMapping("/student")
	public Student getStudent(String id, HttpServletRequest request) {
		Student student = service.getStudent(id);
		String name = student.getNAME();
		System.out.println("name:" + name);
		return null;
	}
}
