package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Products;

public interface RecommendationService {
	public List<Products> getRecommendations();
	public void saveRecommendation(Products product);
}
