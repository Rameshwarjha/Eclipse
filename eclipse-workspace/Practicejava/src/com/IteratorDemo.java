package com;
import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> n = new ArrayList<String>();
		names.add("Rameshwar");
		names.add("Rj");
		names.add("Steven");
		
		Iterator it = names.iterator();
		
		while(it.hasNext()) {
			String obj =(String)it.next();
			System.out.printf(obj);
			
		}
		
	}

}
