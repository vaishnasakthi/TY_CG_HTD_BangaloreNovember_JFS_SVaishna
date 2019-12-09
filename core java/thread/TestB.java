package com.capg.thread.creatingthread;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestB {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(26);
		a1.add(35);
		a1.add(97);
		a1.add(20);
		List<Integer> l1=a1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);
        System.out.println("------------Map-------------");
        
        List<Integer> l2=a1.stream().map(i->i*100).collect(Collectors.toList());
        System.out.println(l2);
        
        System.out.println("------------Max-------------");
       Optional<Integer> a=a1.stream().max((i,j)->i.compareTo(j));
        System.out.println(a);
        
        System.out.println(a1.stream().count());
	}

}
