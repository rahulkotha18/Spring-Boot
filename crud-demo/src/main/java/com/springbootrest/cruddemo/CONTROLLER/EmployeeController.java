package com.springbootrest.cruddemo.CONTROLLER;

import com.springbootrest.cruddemo.DAO.EmployeeDAO;
import com.springbootrest.cruddemo.ENTITY.Employee;
import com.springbootrest.cruddemo.EXCEPTION.EmployeeNotFoundException;
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


    @CrossOrigin(origins = "http://localhost:3001")


    @GetMapping("/employee")
    public List<Employee> getEmployees()
    {
        return employeeService.getAll();
    }
    @CrossOrigin(origins = "http://localhost:3001")
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id)
    {
        Employee employee=employeeService.get(id);
        if(employee==null)
            throw new EmployeeNotFoundException("Employee not found");
        return employee;
    }
    @CrossOrigin(origins = "http://localhost:3001")
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee e)
    {
        return employeeService.save(e);
    }
    @CrossOrigin(origins = "http://localhost:3001")
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee e)
    {
        return employeeService.update(e);
    }
    @CrossOrigin(origins = "http://localhost:3001")
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        Employee employee=employeeService.get(id);
        if(employee==null)
            throw new EmployeeNotFoundException("No Employee!");
        return employeeService.delete(id);
    }

}
