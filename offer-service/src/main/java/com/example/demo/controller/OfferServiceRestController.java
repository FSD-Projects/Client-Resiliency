package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Offer;
import com.example.demo.service.OfferService;

@RestController
public class OfferServiceRestController {

	@Autowired
	private OfferService offerService;
	
	@RequestMapping(value = "/getCurrentOffers", method = RequestMethod.GET)
	public List<Offer> getCurrentOffers() {
		return offerService.getCurrentOffers();
	}

}
