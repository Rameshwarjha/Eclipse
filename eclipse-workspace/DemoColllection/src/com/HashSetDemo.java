package com;

import java.util.HashMap;
import java.util.Map;

public class HashSetDemo {

	public static void main(String[] args) {
		//Using Map
		Map m1 = new HashMap();
		
		m1.put("zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		
		System.out.println();
		System.out.println("Map Elements");
		System.out.println("\t"+m1);
		
		for(int i=0; i<3;i++) {
			
			
		}
		
		System.out.println(m1.remove("Mahnaz"));
		System.out.println(m1.get("Suresh"));
		m1.put("2", "Zara");
		System.out.println(m1);
		
        		
		
		

	}
	
	//HashMap
	/*public static void main(String[] args) {
		// Using HashMap
		HashMap m1 = new HashMap();
		
		m1.put("zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		
		System.out.println();
		System.out.println("Map Elements");
		System.out.println("\t"+m1);
		
		

	}*/

}
