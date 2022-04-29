package com;
import java.util.*;

public class test {
	public static int fahrenheitToCelcius(int farhenheit) {

		int celcius = (int)Math.round((farhenheit - 32)* 5f / 9f);
		return Math.round(celcius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fahrenheitToCelcius(25));
	}

}
