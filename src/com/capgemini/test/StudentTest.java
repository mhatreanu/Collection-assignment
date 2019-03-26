package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Student;

public class StudentTest {

	private static Student anu;
	private static Student guru;
	private static Student ram;
	
	@BeforeClass
	public static void setUp() {
		anu=new Student("anu",1,"Mumbai");
		guru=new Student("guru",2,"Pune");
		ram=new Student("ram",3,"Thane");
	}
	
	@Test
	public void testStudentAcceptingDuplicates() {
		HashSet<Student>student=new HashSet<Student>();
		student.add(anu);
		student.add(guru);
		student.add(ram);
		assertEquals(3,student.size());
	}

	@Test
	public void testFavouriteFruit() {
		HashMap<String,String> fruit=new HashMap<String, String>();
		fruit.put(anu.getName(),"Mango");
		fruit.put(guru.getName(),"Grapes");
		fruit.put(ram.getName(),"Litchi");
		assertEquals("Mango",fruit.get(anu.getName()));		
	}
	
	@Test
	public void getFavouriteFruit() {
		HashMap<String,String> fruit=new HashMap<String, String>();
		  assertTrue(fruit.values().contains("Mango"));
		  assertTrue(fruit.values().contains("Grapes"));
		  assertTrue(fruit.values().contains("Litchi"));
		  assertFalse(fruit.values().contains("anu"));
		  assertFalse(fruit.values().contains("guru"));
		  assertFalse(fruit.values().contains("ram"));
		  
		  assertTrue(fruit.keySet().contains("anu"));
		  assertTrue(fruit.keySet().contains("guru"));
		  assertTrue(fruit.keySet().contains("ram"));
		  assertFalse(fruit.values().contains("Mango"));
		  assertFalse(fruit.values().contains("Grapes"));
		  assertFalse(fruit.values().contains("Litchi"));
		 
	}
}
