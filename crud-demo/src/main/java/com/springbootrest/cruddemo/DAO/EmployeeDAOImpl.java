package com.springbootrest.cruddemo.DAO;

import com.springbootrest.cruddemo.ENTITY.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        Session session=entityManager.unwrap(Session.class);
        Query<Employee> query=session.createQuery("from Employee",Employee.class);
        List<Employee> employees=query.getResultList();
        return employees;
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        Session session=entityManager.unwrap(Session.class);
        Employee employee=session.get(Employee.class,id);
        return employee;
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee e) {
        Session session=entityManager.unwrap(Session.class);
        session.save(e);
        return e;
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee e) {
        Session session=entityManager.unwrap(Session.class);
        session.update(e);
        return e;
    }

    @Override
    @Transactional
    public String deleteEmployee(int id) {
        Session session=entityManager.unwrap(Session.class);
        Employee employee=session.get(Employee.class,id);
        session.delete(employee);
        return "Employee with id:"+id+" is removed";
    }
}
