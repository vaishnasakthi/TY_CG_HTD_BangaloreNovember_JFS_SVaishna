package com.cpg.map.treemap;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		SortedAge sg=new SortedAge();
		TreeMap<Student,String> t1=new TreeMap<Student,String>(sg);
		
		t1.put(new Student("Jack",4), "1st Standard");	
		t1.put(new Student("Jonny",5), "2st Standard");
		t1.put(new Student("kenn",3), "3st Standard");
		
		Set<Map.Entry<Student,String>> s1=t1.entrySet();
		for(Map.Entry<Student,String> i1: s1) {
			System.out.println(i1.getKey());
			System.out.println(i1.getValue());
			System.out.println("-----------------");
		}
		System.out.println(t1.get(new Student("Jonny",5)));

	}

}
