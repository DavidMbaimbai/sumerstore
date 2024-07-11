package com.sumer.repository;

import com.sumer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long > {
    Customer register(Customer customer);
    Customer login(String email, String password);
    Customer updateProfile(String id, Customer customer);

}
