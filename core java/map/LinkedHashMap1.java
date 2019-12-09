package com.cpg.map.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap <String,Integer>l1=new LinkedHashMap<String,Integer>();
		l1.put("Hebbal",560032);
		l1.put("BTR",560082);
		l1.put("Rajajinagar",560052);
		l1.put(null,560052);
		
		
		l1.remove(null);
		System.out.println("------all keys value");
	  Set <String>s2=	l1.keySet();
	  for(String i1: s2) {
		  System.out.println(i1);
		  System.out.println("-----------------------------");
		  
	  }
		
		
		Set <Map.Entry<String,Integer>> s1=l1.entrySet();
		
		
		
		for(Map.Entry<String, Integer> i1:s1) {
			System.out.println(i1.getKey());
			System.out.println(i1.getValue());
			System.out.println("-----------------------------");
		}

	}

}
