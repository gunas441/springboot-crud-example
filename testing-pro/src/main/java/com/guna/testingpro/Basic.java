package com.guna.testingpro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="basic")
public class Basic {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="fullname")
	private String fullname;
	@Column(name="salary")
	private int salary;
	@Transient
	private int SalaryPerYear;
	
	public int getSalaryPerYear() {
		return SalaryPerYear;
	}
	public void setSalaryPerYear(int salaryPerYear) {
		SalaryPerYear = salaryPerYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
