package com;
import java.util.*;



public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list  = new ArrayList<String>();
		
		list.add("mango");
		list.add("Apple");
		list.add("banana");
		list.add("grapes");
		list.add("cherries");
		
		for(String item: list) {
			System.out.println(item);
			
		}
		
		list.set(1, "grapes");
		
		System.out.println();
		System.out.println();
		
		
		for(String item:list) {
			System.out.println(item);
			
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(12);
		list2.add(55);
		list2.add(22);
		
		for(Integer value:list2) {
			System.out.println(value);
			
		}
		
		Collections.sort(list2);
		System.out.println();
		
		
		for(Integer value:list2) {
			System.out.println(value);
		}
		
		
		

	}

}
