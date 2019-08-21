package com.springbootrest.cruddemo.spring_JPA_Data;

import com.springbootrest.cruddemo.ENTITY.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
