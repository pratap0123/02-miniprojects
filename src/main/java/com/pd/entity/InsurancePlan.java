package com.pd.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "insurance")
public class InsurancePlan {

	@Id
	@GeneratedValue
//	@Column(name = "ins_Plan_Id")
	private Integer insPlanId;
//	@Column(name = "ins_Plan_Name")
	private String insPlanName;

	@OneToMany(targetEntity = Customer.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cust_fk",referencedColumnName = "insPlanId")
	private List<Customer> customers;

}
