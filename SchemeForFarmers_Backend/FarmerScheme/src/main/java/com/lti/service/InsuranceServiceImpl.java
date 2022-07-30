package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Insurance;
import com.lti.repository.InsuranceRepo;
@Service
public class InsuranceServiceImpl implements InsuranceService {
	@Autowired
	private InsuranceRepo insuranceRepo;
	@Override
	public Insurance findById(int id) {
		return insuranceRepo.findById(id);
	}

}
