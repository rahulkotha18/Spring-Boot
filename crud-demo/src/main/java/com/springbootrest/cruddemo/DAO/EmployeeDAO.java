package com.springbootrest.cruddemo.DAO;

import com.springbootrest.cruddemo.ENTITY.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getEmployees();
    public Employee getEmployee(int id);
    public Employee saveEmployee(Employee e);
    public Employee updateEmployee(Employee e);
    public String deleteEmployee(int id);
}
