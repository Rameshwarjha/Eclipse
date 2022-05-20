package com.demo.SpringBootMongoDBEX.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.SpringBootMongoDBEX.model.Customer;

public interface CustRepo extends MongoRepository<Customer,Integer>  {

}
