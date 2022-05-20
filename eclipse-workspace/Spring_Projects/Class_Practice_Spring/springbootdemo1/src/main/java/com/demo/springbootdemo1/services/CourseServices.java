package com.demo.springbootdemo1.services;

import java.util.List;

import com.demo.springbootdemo1.Entities.Course;
 
public interface CourseServices {
	
	public List<Course> getCourses();
	
	public Course getCourse(long CourseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);

}
