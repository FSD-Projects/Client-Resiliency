package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Products;
import com.example.demo.repository.RecommendationRepository;

@Service
public class RecommendationServiceImpl implements RecommendationService{
	@Autowired
	private RecommendationRepository recommendationRepository;
	@Override
	public List<Products> getRecommendations() {
		// TODO Auto-generated method stub
		return recommendationRepository.findAll();
	}
	@Override
	@Transactional
	public void saveRecommendation(Products product) {
		// TODO Auto-generated method stub
		recommendationRepository.save(product);
	}

}
