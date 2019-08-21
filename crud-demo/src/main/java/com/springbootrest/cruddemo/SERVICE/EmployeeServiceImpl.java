package com.springbootrest.cruddemo.SERVICE;

import com.springbootrest.cruddemo.DAO.EmployeeDAO;
import com.springbootrest.cruddemo.ENTITY.Employee;
import com.springbootrest.cruddemo.spring_JPA_Data.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class EmployeeServiceImpl implements Service {

    @Autowired
    private EmployeeRepository employee;
    @Override
    public List<Employee> getAll() {
        return employee.findAll();
    }

    @Override
    public Employee get(int id) {
        Optional<Employee> res= employee.findById(id);
        Employee emp=null;
        if(res.isPresent())
        {emp=res.get();}
        else
            throw new RuntimeException() ;
        return emp;
    }

    @Override
    public Employee save(Employee e) {

        return employee.save(e);
    }

    @Override
    public Employee update(Employee e)
    { return  employee.save(e); }

    @Override
    public String delete(int id)
    {
        employee.deleteById(id);
        return "employee deleted";
    }
}
