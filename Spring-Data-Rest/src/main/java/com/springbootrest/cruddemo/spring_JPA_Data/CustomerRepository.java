package com.springbootrest.cruddemo.spring_JPA_Data;

import com.springbootrest.cruddemo.ENTITY.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "members")
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
