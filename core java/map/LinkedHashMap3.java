package com.cpg.map.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap3 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(34,new Employee(22000,"jack"));
		l1.put(64,new Employee(29000,"jonson"));
		l1.put(74,new Employee(92000,"Hassel"));
         //get() to retrieve value by using key
		System.out.println(l1.get(64));
		
		Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
		for(Map.Entry<Integer,Employee> o1:s1 ) {
		System.out.println(o1.getKey());
		System.out.println(o1.getValue());
		System.out.println("-------------------");
		}
		
		System.out.println(l1.containsKey(64));
		System.out.println(l1.containsValue(new Employee(29000,"jonson")));
		
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		
	}

}
