package com.pd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.entity.InsurancePlanStatus;
import com.pd.repo.InsurancePlanStatusRepo;

@Service
public class InsurancePlanStatusImpl implements IInsurancePlanStatus {
	@Autowired
	private InsurancePlanStatusRepo repo;

	@Override
	public List<InsurancePlanStatus> getAlls() {
		List<InsurancePlanStatus> all = repo.findAll();
		return all;
	}

	@Override
	public InsurancePlanStatus getById(Integer id) {
		Optional<InsurancePlanStatus> status = repo.findById(id);
		return status.get();
	}

}
