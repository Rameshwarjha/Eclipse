package com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count[]= {34,22,10,60,30,22};
		Set<Integer> set = new HashSet<Integer>();
		
		try {
			for(int i=0;i<5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet<Integer> sortedset = new TreeSet<Integer>(set);
			System.out.println("The sorted list is");
			System.out.println(sortedset);
			
			System.out.println("The first element of the set is "+ sortedset.first());
			System.out.println("The last element of the set is "+ sortedset.last());
			
			int a = sortedset.first()+sortedset.last();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		

	}

}
