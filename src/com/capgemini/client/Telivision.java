package com.capgemini.client;

import java.util.Objects;

public class Telivision {
	
	private String company;
	private String type;
	private boolean enable;
	private double price;
	public Telivision() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Telivision(String company, String type, boolean enable, double price) {
		super();
		this.company = company;
		this.type = type;
		this.enable = enable;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
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
		if (!(obj instanceof Laptop))
			return false;

		Telivision l = (Telivision) obj;
		if (this.company == l.company && this.type == l.type)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, type);
				
	}

}
