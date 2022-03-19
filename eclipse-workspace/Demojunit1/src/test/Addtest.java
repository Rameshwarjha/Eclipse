package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Junitclass;

class Addtest {

	@Test
	public void Addtest()
	{
		Junitclass jc = new Junitclass();
		int result= jc.Add(500, 600);      //it will test the class in code and store output in result
		assertEquals(1101,result);         //it is the method for testing tests the result with expected output
		
	}
	@Test
       protected void Addtest1() {
		Junitclass jc1 = new Junitclass();
		int result = jc1.Add(200, 300);
		assertEquals(500,result);
	}

}
