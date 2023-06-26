package com.employee.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.EmployeeEntity;
import com.employee.demo.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	@Autowired
 EmployeeRepo er;
	public String addInfo(EmployeeEntity ee) {
		   er.save(ee);
	return "Data added to DataBase";
	}
	
	public String updateInfo(EmployeeEntity ee) {
		   er.save(ee);
	return "Data has been Updated";
	}
	
	public String deleteInfo(int id) {
		   er.deleteById(id);
		return "Data Deleted";
	}
	
	public List<EmployeeEntity>getInfo() {
		return er.findAll();
	}
	
	public String addBulk(List<EmployeeEntity> ee) {
		   er.saveAll(ee);
		return "All Saved Successfull";
	}
	
	public EmployeeEntity getIdde(int id) {
		return er.findById(id).get();
	}
	
	public String allde() {
		   er.deleteAll();
		return "All Deleted";
	}
	
	public List<EmployeeEntity> getByRange(int salary1,int salary2) {
		return er.getByRange(salary1,salary2);
	}
	
	public EmployeeEntity highSal() {
		return er.highSal();
	}
	
	public List<EmployeeEntity> salInc() {
		return er.findAll();
	}
	
}
