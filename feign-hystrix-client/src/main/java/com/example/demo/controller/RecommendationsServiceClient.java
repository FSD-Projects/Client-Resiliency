package com.example.demo.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Products;

@FeignClient("recommendation-service")
public interface RecommendationsServiceClient {
	@RequestMapping(value = "/recommendations", method = RequestMethod.GET) 
	public List<Products> getRecommendations();
	@RequestMapping(value = "/saveRecommendation", method = RequestMethod.POST) 
	public void saveRecommendation(Products product);
}
