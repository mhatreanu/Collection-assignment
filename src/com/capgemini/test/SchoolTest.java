package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

public class SchoolTest {
	
	private static School balmohan;
	private static School ies;
	private static School bmc;
	
	@BeforeClass
	public static void setUp() {
		balmohan=new School("balmohan","Mumbai","Maharashtra",100);
		ies=new School("ies","Saphale","Thane",10);
		bmc=new School("bmc","Ahemdabad","Gujrat",100);
	}
	
	@Test
	public void testSchoolHashsetAcceptingDuplicates() {
		HashSet<School>  school= new HashSet<School>();
		school.add(balmohan);
		school.add(ies);
		school.add(bmc);
		
		assertEquals(3, school.size());
	}

	
	  @Test public void testSchoolArraylistMaintaingOrder() {
		  ArrayList<School>
	  school = new ArrayList<School>(); 
		  school.add(balmohan); 
		  school.add(ies);
	  school.add(bmc);
	  
	  Iterator<School> iterator = school.iterator(); assertEquals("balmohan",
	  iterator.next().getName()); assertEquals("ies", iterator.next().getName());
	  assertEquals("bmc", iterator.next().getName()); }
	 

}
