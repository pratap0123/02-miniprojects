package com.pd.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pd.entity.InsurancePlanStatus;
import com.pd.service.IInsurancePlanStatus;

@RestController
@RequestMapping("/status")
public class PlanStatusController {

	@Autowired
	private IInsurancePlanStatus service;

	@GetMapping("/all")
	public List<InsurancePlanStatus> getAlls() {

		List<InsurancePlanStatus> alls = service.getAlls();

		return alls;

	}

	@GetMapping("/one/{id}")
	public InsurancePlanStatus getOneStatsu(@PathVariable Integer id) {

		InsurancePlanStatus byId = service.getById(id);

		return byId;

	}
}
