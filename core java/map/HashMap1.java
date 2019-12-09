package com.cpg.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap <Integer,String>h1=new HashMap<Integer,String>();
		h1.put(21,"jack");
		h1.put(43,"avni");
		h1.put(65,"kenny");
		h1.put(18,"justine");
		
		Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		for(Map.Entry<Integer,String> a1:s1) {
			System.out.println(a1.getKey());
			System.out.println(a1.getValue());
			System.out.println("--------------");
		}
		
	}
}
