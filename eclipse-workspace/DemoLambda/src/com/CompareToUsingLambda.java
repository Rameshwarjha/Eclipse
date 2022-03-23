package com;
import java.util.*;

 class Product89{
	int id;
	String name;
	float price;
	
	Product89(int id, String name, float Price){
		this.id = id;
		this.name = name;
		this.price = Price;
		
	}
}

public class CompareToUsingLambda {

	public static void main(String[] args) {
		
		List<Product89> list = new ArrayList<Product89>();
		
		list.add(new Product89(1,"HP Laptop",25000f));
		list.add(new Product89(2,"Keyboard",300f));
		list.add(new Product89(3,"Dell Mouse", 150f));
		
		//implementing lambda expression
		Collections.sort(list,(p1,p2)->{
			
			//these statements get printed multiple time during working of "collections.sort"
			System.out.println(p1.name);
			System.out.println(p2.name);
			return p1.name.compareTo(p2.name);
			
			
		});
		
		System.out.println("Sorting on the basis of name");
		for(Product89 p:list) {
			System.out.println(p.id + " " +p.name + " " + p.price);
			
		}
		
		
	

	}

}
