package com.capgemini.test;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Phone;


public class PhoneTest {
	
	private static Phone vivo;
	private static Phone moto;
	private static Phone mi;

	@BeforeClass
	public static void setUp() {
		vivo=new Phone("vivo","V5","ios",30000);
		moto=new Phone("moto","Play","android",20000);
		mi=new Phone("mi","Prime","symbian",15000);
	}
	
	@Test
	public void testPhoneHashsetAcceptingDuplicates() {
		HashSet<Phone> phone = new HashSet<Phone>();
		phone.add(vivo);
		phone.add(moto);
		phone.add(mi);
		phone.add(mi);
		assertEquals(3, phone.size());
	}

	@Test
	public void testPhoneArraylistMaintaingOrder() {
		ArrayList<Phone> phone  = new ArrayList<Phone>();
		phone.add(vivo);
		phone.add(moto);
		phone.add(mi);

		Iterator<Phone> iterator = phone.iterator();
		assertEquals("vivo", iterator.next().getCompany());
		assertEquals("moto", iterator.next().getCompany());
		assertEquals("mi", iterator.next().getCompany());
	}
}

