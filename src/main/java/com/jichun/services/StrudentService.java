package com.jichun.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jichun.dao.StudentDao;
import com.jichun.domain.Student;

@Service
public class StrudentService {

	@Autowired
	private StudentDao dao;

	public Student getStudent(String id) {
		Student student = dao.getStudent(id);
		return student;
	}

	public void save(Student student) {
		dao.save(student);
	}
}
