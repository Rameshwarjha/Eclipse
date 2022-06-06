package com.demo.springcore.Hello_world_maven_Project;

public class Student {
	
	private int stuId;
	private String stuName;
	private String stuCity;
	

	public Student(int stuId, String stuName, String stuCity) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuCity = stuCity;
	}
	


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getStuId() {
		return stuId;
	}


	public void setStuId(int stuId) {
		this.stuId = stuId;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getStuCity() {
		return stuCity;
	}


	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}

	

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuCity=" + stuCity + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
