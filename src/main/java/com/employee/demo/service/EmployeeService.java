package com.employee.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.dao.EmployeeDao;
import com.employee.demo.entity.EmployeeEntity;

@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;
public String addInfo(EmployeeEntity ee) {
	return ed.addInfo(ee);
}

public String updateInfo(EmployeeEntity ee) {
	return ed.updateInfo(ee);
}

public String deleteInfo(int id) {
	return ed.deleteInfo(id);
}

public List<EmployeeEntity>getInfo() {
	  return ed.getInfo();
}

public String addBulk(List<EmployeeEntity> ee) {
	return ed.addBulk(ee);
}

public EmployeeEntity getIdde(int id) {
	return ed.getIdde(id);
}

public String allde() {
	return ed.allde();
}

public List<EmployeeEntity> getByRange(int salary1,int salary2) {
	return ed.getByRange(salary1,salary2);
}

public EmployeeEntity highSal() {
	return ed.highSal();
}

public List<EmployeeEntity> salInc() {
	List<EmployeeEntity> li = ed.salInc();
	  for(EmployeeEntity ee : li) {
		  ee.setSalary(ee.getSalary()+5000);
	  }
	  return li;
}

}