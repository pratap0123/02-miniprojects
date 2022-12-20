package com.pd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue
//	@Column(name = "cust_Id")
	private Integer custId;
//	@Column(name = "cust_Name")
	private String custName;
//	@Column(name = "cust_Email")
	private String custEmail;
//	@Column(name = "cust_Gender")
	private String custGender;
//	@Column(name = "cust-Contact_Num")
	private Long custContactNum;
//	@Column(name = "cust_SSN")
	private Long custSSN;

//	@Column(name = "cust_Status")
	private String custStatus;

}
