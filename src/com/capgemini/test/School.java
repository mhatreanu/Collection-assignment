package com.capgemini.test;

import java.util.Objects;

import com.capgemini.client.Phone;

public class School {
	private String name;
	private String city;
	private String district;
	private int schoolRank;

	
	public School(String name, String city, String district, int schoolRank) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.schoolRank = schoolRank;
	}


	public School() {
		super();
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public int getSchoolRank() {
		return schoolRank;
	}


	public void setSchoolRank(int schoolRank) {
		this.schoolRank = schoolRank;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof School))
			return false;

		School s = (School) obj;
		if (this.name == s.name && this.city == s.city && this.district==s.district)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,city,district);
				
	}


	}




