package com;

public class Unchecked0rRuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a = new int[] {1,2,3,4,5};
		
		try {
		for(int i=0;i<6;i++) {
			System.out.println(a[i]);
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			System.out.println("Finally block");
		}
	


	}

}
