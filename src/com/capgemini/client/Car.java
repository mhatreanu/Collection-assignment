package com.capgemini.client;

public class Car implements Comparable<Car> {
	
	private  String make;
	private  String model;
	private  int year;
	private double price;
	
	public Car(String make, String model, int year, double price) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Car obj) {
	return this.make.compareTo(obj.make);
	}
}
