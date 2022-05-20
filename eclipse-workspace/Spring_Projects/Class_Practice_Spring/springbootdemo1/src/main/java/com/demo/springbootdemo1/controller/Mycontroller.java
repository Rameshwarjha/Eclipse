package com.demo.springbootdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootdemo1.Entities.Course;
import com.demo.springbootdemo1.services.CourseServices;

// as we want to send data packets so we need to make rest controller to control all data sending tasks over http
@RestController
public class Mycontroller {
	
	//always make connection using autowired else it would not work
	//otherwise it will give null pointer exception 
	
	@Autowired
	private CourseServices cs;
	
	// mapping is to be done for all the pages with unique names
	@GetMapping("/home")
	private String home() {
		return "Welcome to spring boot world";
		
	}
	
	//get the course 
	@GetMapping("/course")
	public List<Course> getCourses(){
		return this.cs.getCourses();
		
	}
	
	//get the course detail of the particular course
	/**V.V.V. Important - shows how to take value from url path variable
	 *                    using @PathVariable " **/
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.cs.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return this.cs.addCourse(course);
	}
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		
		return this.cs.updateCourse(course);
	}
	
	public void deleteCourse(@PathVariable String courseId) {
		this.cs.deleteCourse(Long.parseLong(courseId));
		 
	}
	

}
