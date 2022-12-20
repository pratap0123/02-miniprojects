package com.pd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pd.entity.InsurancePlan;

public interface InsuranceRepository extends JpaRepository<InsurancePlan, Integer> {

}
