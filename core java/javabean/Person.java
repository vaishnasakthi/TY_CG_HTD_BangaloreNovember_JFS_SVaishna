package javaBean;

import java.io.Serializable;

public class Person implements Serializable{
	private int age;
    private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
   public void setAge(int age) {
	   this.age=age;
   }
   public void getAge() {
	   System.out.println("Age is : "+age);
   }
   public void setName(String name) {
	   this.name=name;
   }
   public void getName() {
	   System.out.println("Name is : "+name);
   }

}
