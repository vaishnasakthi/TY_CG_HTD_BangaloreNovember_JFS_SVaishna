package com.cpg.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		TreeMap <Integer,String>t1=new TreeMap<Integer,String>();
		t1.put(12,"Jackson");
		t1.put(26,"Jack");
		t1.put(46,"Kenn");
//		t1.put(null,"Kenn"); doenot take null value since it takes only comparable ty
		
		
		Set<Map.Entry<Integer,String>> s1=t1.entrySet();
		for(Map.Entry<Integer,String> i1:s1) {
			System.out.println(i1.getKey());
			System.out.println(i1.getValue());
			
			System.out.println("--------------------");
		}

	}

}
