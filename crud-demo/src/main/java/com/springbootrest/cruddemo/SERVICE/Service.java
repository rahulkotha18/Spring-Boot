package com.springbootrest.cruddemo.SERVICE;

import com.springbootrest.cruddemo.ENTITY.Employee;

import java.util.List;

public interface Service {
    public List<Employee> getAll();
    public Employee get(int id);
    public Employee save(Employee e);
    public Employee update(Employee e);
    public String delete(int id);
}
