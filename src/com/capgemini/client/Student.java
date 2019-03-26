package com.capgemini.client;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private String name;
	private int rollNo;
	private String city;
	
	
	public Student(String name, int rollNo, String city) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Student obj) {
		return this.name.compareTo(obj.city);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(obj instanceof Student) {
			return false;
		}
		
		Student student=(Student) obj;
		if(this.name==student.name && this.city==student.city) 
			return true;
		return false;
		
		}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,city);
	}
	}

	


