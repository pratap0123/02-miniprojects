package com.pd.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsurancePlanStatus {

	@Id
	@GeneratedValue
	private Integer statusId;
	private String status;
	
	@OneToMany(targetEntity = Customer.class,cascade = CascadeType.ALL)
	@JoinColumn(name="status_fk",referencedColumnName = "statusId")
	private List<Customer> customers;
}
