package com.demo.spring.CustInfo___Developing_Backend_application_using_spring;

public class Cust {
	
	private int CustId;
	private String CustName;
	
	

	public Cust() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cust(int custId, String custName) {
		super();
		this.CustId = custId;
		this.CustName = custName;
	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		this.CustId = custId;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		this.CustName = custName;
	}

	@Override
	public String toString() {
		return "Cust [CustId=" + CustId + ", CustName=" + CustName + "]";
	}





}
