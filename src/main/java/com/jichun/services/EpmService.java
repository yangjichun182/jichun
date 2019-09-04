package com.jichun.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jichun.dao.EmpDao;
import com.jichun.domain.Employees;

@Service("empService")
public class EpmService {
	
//	@Autowired(required=true)
	@Autowired
	private EmpDao empDao;

	public void save(Employees emp) {
		empDao.save(emp);
	}

	public Employees getEmp(String id) {
		System.out.println("empDao:"+empDao);
		Employees emp = empDao.getEmp(id);
		return emp;
	}
}
