package com.capgemini.client;

import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(list);
		}
	}

}
