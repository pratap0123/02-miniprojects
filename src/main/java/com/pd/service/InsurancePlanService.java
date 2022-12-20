package com.pd.service;

import java.util.List;

import com.pd.entity.InsurancePlan;

public interface InsurancePlanService {

	public List<InsurancePlan> getAllInsurancePlans();

	public InsurancePlan getPlanById(Integer id);
}
