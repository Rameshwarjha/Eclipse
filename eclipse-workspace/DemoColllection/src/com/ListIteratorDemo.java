package com;

/*** ###IMPORTANT####
 * 
 * Is ListIterator bidirectional?
   ListIterator in Java is the most powerful iterator or cursor 
   that was introduced in Java 1.2 version.
   It is a bi-directional cursor.
   Java ListIterator is an interface (an extension of Iterator interface) that is used to
   retrieve the elements from a collection object in "Both forward and reverse directions."
 * 
 */
import java.util.ArrayList;
import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Ravi");
		mylist.add("vijay");
		mylist.add("ajay");
		mylist.add("ravi");
		
		System.out.println("traversing through arraylist");
		
		ListIterator<String> it = mylist.listIterator();
		
		while(it.hasNext()) {
			//going to next
			System.out.println(it.next());
			
			//going to previous
			System.out.println(it.previous());
			
			//going to next again - we can do this multiple times
			//using so that list does not goes on for infinite time
			
			System.out.println(it.next());
			
		
			
			
			
		}

	}

}
