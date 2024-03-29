package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Products;

@Repository
public interface RecommendationRepository extends MongoRepository<Products, Integer>{

}
