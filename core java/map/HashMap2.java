package com.cpg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
		
		h1.put(10,new Student("Jack",20));
		h1.put(34,new Student("Kenny",34));
		h1.put(34,new Student("Kenn",84));
		h1.put(null,null);
		Collection<Student> c1=h1.values();
		System.out.println("-----All Key present-----");
		Set<Integer> s=h1.keySet();
		for(Integer i1:s) {
			System.out.println(i1);
		}
		for(Student s1: c1) {
			System.out.println(s1);
		}
	
		System.out.println(h1.containsKey(34));
		System.out.println(h1.containsValue(new Student("Kenny",34)));
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		
	}

}
