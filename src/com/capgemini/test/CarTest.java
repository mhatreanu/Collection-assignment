package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Car;

public class CarTest {

	private static Car swift;
	private static Car bmw;
	private static Car ferrari;
	
	@BeforeClass
	public static void setUp() {
		swift=new Car("Ind","desire",2000,300000);
		bmw=new Car("Eng","as",2001,500000);
		ferrari=new Car("Pak","bbm",2003,900000);
	}
	
	@Test
	public void testCarAcceptingDuplicates() {
		TreeSet<Car> cars=new TreeSet<Car>();
		cars.add(swift);
		cars.add(bmw);
		cars.add(ferrari);
		
		Iterator<Car> iterator=cars.iterator();
		assertEquals("Eng",iterator.next().getMake());
		assertEquals("Ind",iterator.next().getMake());
		assertEquals("Pak",iterator.next().getMake());
	}

	@AfterClass
	public static void tearDown() {
		swift=null;
		bmw=null;
		ferrari=null;
	}
}
