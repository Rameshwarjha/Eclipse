package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Junitclass;

class Concattest {

	@Test
	public void concat() {
		Junitclass con = new Junitclass();
		String result = con.Concat("a", "b");
		assertEquals("ab",result);
		
		
	}
}
