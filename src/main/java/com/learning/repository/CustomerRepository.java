package com.learning.repository;

import java.util.List;

import com.learning.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}