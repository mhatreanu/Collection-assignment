package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.client.Laptop;

public class LaptopTest {

	private Laptop dell;
	private Laptop hp;
	private Laptop asus;

	@Before
	public void setUp() {
		dell = new Laptop("dell", "G3", "Linux", "Intelcorei1");
		hp = new Laptop("hp", "ENVY", "Windows10", "Intelcorei2");
		asus = new Laptop("asus", "Vivobook", "Windows7", "Intelcorei3");
	}

	@Test
	public void testLaptopHashsetAcceptingDuplicates() {
		HashSet<Laptop> laptops = new HashSet<Laptop>();
		laptops.add(dell);
		laptops.add(hp);
		laptops.add(asus);
		laptops.add(hp);
		assertEquals(3, laptops.size());
	}

	@Test
	public void testLaptopArraylistMaintaingOrder() {
		ArrayList<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(dell);
		laptops.add(hp);
		laptops.add(asus);

		Iterator<Laptop> it = laptops.iterator();
		assertEquals(dell, it.next());
	}

	/*
	 * @AfterClass public static void teerDown() { dell=null; hp=null; asus=null; }
	 */

}
