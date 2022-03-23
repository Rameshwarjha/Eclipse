package com;
import java.util.*;

import java.util.ArrayList;
import java.util.List;



public class LamdaForEachLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		
		//using for each loop using lamda expression
		
		//"objectname"."forEach"((n)->"Statement");
		
		list.forEach(
			//format for using for each loop
			(n)->System.out.println(n)
		);

	}

}
