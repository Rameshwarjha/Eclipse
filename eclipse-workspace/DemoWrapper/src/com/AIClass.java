package com;

interface Age{
	int x = 21;
	void getAge();
}

public class AIClass {
	
	public static void main(String args[]) {
		
		//using anonymous class
		Age obj1 = new Age() {
			public void getAge() {
				System.out.println("age is ="+x);
				
				List<String> list =new ArrayList<String>();
				
			}
			
		};    //semicolon at end of anonymous class
		
		obj1.getAge();
	}
	

}
