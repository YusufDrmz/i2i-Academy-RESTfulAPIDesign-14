package com.i2i.restful_api_swagger.repository;


import com.i2i.restful_api_swagger.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}