package com.demo.springcore.auto.wire.DemoAutowiring.Annotations;

//imported autowired if do not want to use in the xml and 
// if we want to do autowiring inside the java file only then we need this package
import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;
	

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}




	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
