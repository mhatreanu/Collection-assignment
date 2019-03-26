package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Telivision;

public class TeliTest {

	private static Telivision sony;
	private static Telivision lg;
	private static Telivision samsung;
	
	@BeforeClass
	public static void setUp() {
		sony=new Telivision("sony","led",true,30000);
		lg=new Telivision("lg","led",false,20000);
		samsung=new Telivision("samsung","plasma",true,15000);
	}
	
	@Test
	public void testLaptopHashsetAcceptingDuplicates() {
		HashSet<Telivision> tel = new HashSet<Telivision>();
		tel.add(sony);
		tel.add(lg);
		tel.add(samsung);
		
		assertEquals(3, tel.size());
	}

	@Test
	public void testLaptopArraylistMaintaingOrder() {
		ArrayList<Telivision> tel  = new ArrayList<Telivision>();
		tel.add(sony);
		tel.add(lg);
		tel.add(samsung);

		Iterator<Telivision> iterator = tel.iterator();
		assertEquals("sony", iterator.next().getCompany());
		assertEquals("lg", iterator.next().getCompany());
		assertEquals("samsung", iterator.next().getCompany());
	}
}
