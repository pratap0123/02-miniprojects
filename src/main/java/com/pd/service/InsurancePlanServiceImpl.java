package com.pd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.entity.InsurancePlan;
import com.pd.repo.InsuranceRepository;

@Service
public class InsurancePlanServiceImpl implements InsurancePlanService {

	@Autowired
	private InsuranceRepository repo;

	@Override
	public List<InsurancePlan> getAllInsurancePlans() {

		List<InsurancePlan> plans = repo.findAll();
		return plans;
	}

	@Override
	public InsurancePlan getPlanById(Integer id) {
		Optional<InsurancePlan> planById = repo.findById(id);
		return planById.get();
	}

}
