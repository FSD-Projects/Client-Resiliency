package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Products;
import com.example.demo.service.RecommendationService;

@RestController
public class RecommendationsServiceRestController {
	@Autowired
	private RecommendationService recommendationService;
	@RequestMapping(value = "/recommendations", method = RequestMethod.GET)
	public List<Products> getRecommendations() {
		return recommendationService.getRecommendations();
	}
	@RequestMapping(value = "/saveRecommendation", method = RequestMethod.POST)
	public void saveRecommendation(@RequestBody Products product) {
		recommendationService.saveRecommendation(product);
		System.out.println("============================" + product.getName());
	}
}
