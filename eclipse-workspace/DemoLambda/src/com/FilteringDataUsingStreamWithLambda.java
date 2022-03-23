package com;

import java.util.*;
import java.util.stream.Stream;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float Price) {
		super();             //it is not needed here actually
		this.id= id;
		this.name = name;
		this.price = Price;
		
	}
}

public class FilteringDataUsingStreamWithLambda {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"Samsung a5", 17000f));
		list.add(new Product(2,"Samsung a5", 17000f));
		list.add(new Product(3,"Samsung a5", 22200f));
		list.add(new Product(4,"Samsung a5", 17000f));
		list.add(new Product(5,"Samsung a5", 21000f));
		list.add(new Product(6,"Samsung a5", 17000f));
		list.add(new Product(7,"Samsung a5", 17000f));
		
		
		//using lambda to filter data
		Stream<Product> filtered_data = list.stream().filter(p->p.price>20000);
		
		//using lambda expression to iterate through collection 
		filtered_data.forEach(
				product -> System.out.println(product.name+": "+product.price)
				
				);
		
	
		
		
	}

}
