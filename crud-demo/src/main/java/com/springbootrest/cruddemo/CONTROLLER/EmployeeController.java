package com.springbootrest.cruddemo.CONTROLLER;

import com.springbootrest.cruddemo.DAO.EmployeeDAO;
import com.springbootrest.cruddemo.ENTITY.Employee;
import com.springbootrest.cruddemo.SERVICE.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private Service employeeService;
    
    @GetMapping("/")
    public String index()
    {
        return "this is working..!";
    }
    @GetMapping("/employee")
    public List<Employee> getEmployees()
    {
        return employeeService.getAll();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id)
    {
        return employeeService.get(id);
    }
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee e)
    {
        return employeeService.save(e);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee e)
    {
        return employeeService.update(e);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        return employeeService.delete(id);
    }

}
