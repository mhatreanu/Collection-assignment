package com.capgemini.client;

import java.util.Objects;

public class Phone {
	
	private String company;
	private String model;
	private String os;
	private double price;
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String company, String model, String os, double price) {
		super();
		this.company = company;
		this.model = model;
		this.os = os;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Phone))
			return false;

		Phone p = (Phone) obj;
		if (this.company == p.company && this.model == p.model)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, model);
				
	}

}
