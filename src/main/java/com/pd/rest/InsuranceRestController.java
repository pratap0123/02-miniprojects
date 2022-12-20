package com.pd.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pd.entity.InsurancePlan;
import com.pd.service.InsurancePlanService;

@RestController
@RequestMapping("/insu")
public class InsuranceRestController {

	@Autowired
	private InsurancePlanService service;

	@GetMapping("/all")
	public List<InsurancePlan> getAllPlans() {
		List<InsurancePlan> allInsurancePlans = service.getAllInsurancePlans();
		return allInsurancePlans;

	}

	@GetMapping("/one/{id}")
	public InsurancePlan getPlanById(@PathVariable Integer id) {
		InsurancePlan planById = service.getPlanById(id);
		return planById;

	}
}
