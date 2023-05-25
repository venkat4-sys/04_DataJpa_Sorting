package com.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="EMP_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private Integer empId;
	
	private String empName;
	
	private Double empsal;
	
	private String empGender;
	
	private String dept;

}
