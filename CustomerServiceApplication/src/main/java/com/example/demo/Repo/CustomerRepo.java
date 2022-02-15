package com.example.demo.Repo;

import com.example.demo.Model.Customer;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepo extends MongoRepository<Customer,String> {
    //@Query("{bookName:?0}")
    List<Customer> findByCustomerName(String name);
}
