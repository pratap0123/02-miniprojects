package com.pd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pd.entity.InsurancePlanStatus;

public interface InsurancePlanStatusRepo extends JpaRepository<InsurancePlanStatus, Integer>{

}
