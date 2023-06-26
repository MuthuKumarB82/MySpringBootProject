package com.employee.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.demo.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{
     
@Query(value = "select*from employee where salary>? and salary<?", nativeQuery=true)
   public List<EmployeeEntity> getByRange(int salary1,int salary2);

@Query(value = "select * from employee order by desc salary Limit 1", nativeQuery = true)
    public EmployeeEntity highSal();

}