package com.pd.service;

import java.util.List;

import com.pd.entity.InsurancePlanStatus;

public interface IInsurancePlanStatus {

	public List<InsurancePlanStatus> getAlls();

	public InsurancePlanStatus getById(Integer id);
}
