package com.employee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.EmployeeEntity;
import com.employee.demo.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
  EmployeeService es;

@PostMapping(value = "/add")
    public String addInfo(@RequestBody EmployeeEntity ee) {
	  return es.addInfo(ee);
    }

@PutMapping(value = "/update")
   public String updateInfo(@RequestBody EmployeeEntity ee) {
	  return es.updateInfo(ee);
}

@DeleteMapping(value = "/delete/{id}")
  public String deleteInfo(@PathVariable int id) {
	return es.deleteInfo(id);
}

@GetMapping(value = "/show")
    public List<EmployeeEntity>getInfo() {
	  return es.getInfo();
}

@PostMapping(value ="/addBulk")
    public String addBulk(@RequestBody List<EmployeeEntity> ee) {
	   return es.addBulk(ee);
}

@GetMapping(value = "/getId/{id}")
  public EmployeeEntity getIdde(@PathVariable int id) {
	  return es.getIdde(id);
}

@DeleteMapping(value = "/dele")
  public String allde() {
	   return es.allde();
}

@GetMapping(value = "/findSalary/{from}/{to}")
  public List<EmployeeEntity> getByRange(@PathVariable("from")int salary1,@PathVariable("to")int salary2) {
	return es.getByRange(salary1,salary2);
}

//@GetMapping(value = "/findHigh")
//   public EmployeeEntity findHigh()
//          int max = 0;
//          String temp = "";
//      for(int i=0; i<getSalary().length(); i++) {
//    	  if(getSalary()>max) {
//    		  temp = getId();
//    	  }
//    	  return es.findHigh();
//      }
      
@GetMapping(value = "/highSal")
   public EmployeeEntity highSal() {
	   return es.highSal();
}

@GetMapping(value ="/addSal")
     public List<EmployeeEntity> salInc() {
	        return es.salInc();
}

}