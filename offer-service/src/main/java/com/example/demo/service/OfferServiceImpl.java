package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Offer;
import com.example.demo.repository.OfferRepository;

@Service
public class OfferServiceImpl implements OfferService {

	@Autowired
	private OfferRepository offerRepository;
	@Override
	public List<Offer> getCurrentOffers() {
		// TODO Auto-generated method stub
		return offerRepository.findAll();
	}

}
