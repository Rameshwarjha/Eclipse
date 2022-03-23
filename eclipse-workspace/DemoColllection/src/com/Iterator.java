package com;
import java.util.*;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ravi");
		list.add("vijay");
		list.add("ajay");
		list.add("ravi");
		
		System.out.println("traversing through arraylist");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
