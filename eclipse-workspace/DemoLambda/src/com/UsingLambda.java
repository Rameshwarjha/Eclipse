package com;

@FunctionalInterface    // it is optional
interface Drawable{
	public void draw();
}

public class UsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width =10;
		
		//with lambda
		Drawable d2=()->{
			System.out.println("width is"+ width);
		};

	}

}
