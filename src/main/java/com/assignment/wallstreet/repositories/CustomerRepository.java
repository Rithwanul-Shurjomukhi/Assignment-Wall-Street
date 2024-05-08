package com.assignment.wallstreet.repositories;

import com.assignment.wallstreet.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
