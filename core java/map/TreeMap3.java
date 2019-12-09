package com.cpg.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {

	public static void main(String[] args) {
		ArrayList<Student1> a1=new ArrayList<Student1>();
		a1.add(new Student1("Lisa",4));
		a1.add(new Student1("Riya",6));
		ArrayList<Student1> a2=new ArrayList<Student1>();
		a2.add(new Student1("Hassel",3));
		a2.add(new Student1("Sia",5));
		ArrayList<Student1> a3=new ArrayList<Student1>();
		a3.add(new Student1("Kenn",7));
		a3.add(new Student1("Jordan",5));
		
		TreeMap<String,ArrayList> t1=new TreeMap<String,ArrayList>();
		t1.put("1st Standard",a1);
		t1.put("2st Standard",a2);
		t1.put("3st Standard",a3);
        
		Set<Map.Entry<String,ArrayList>> s1=t1.entrySet();
		for(Map.Entry<String,ArrayList> i1: s1) {
			System.out.println(i1.getKey());
			System.out.println(i1.getValue());
			System.out.println("--------------");
		}
	}

}
