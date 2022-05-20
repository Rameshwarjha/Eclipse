package com.demo.springbootdemo1.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.dialect.MySQL8Dialect;

@Entity
@Table(name = "course")
public class Course {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Course(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	
	

}
