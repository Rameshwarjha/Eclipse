package com.demo.springbootdemo1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.springbootdemo1.Dao.CourseDao;
import com.demo.springbootdemo1.Entities.Course;

@Service
public class CourseServiceIMPL implements CourseServices {
	
	/*List<Course> list;
	
	public CourseServiceIMPL() {
		list= new ArrayList<>();
		list.add(new Course(202,"Spring"));
		list.add(new Course(203,"java"));
		list.add(new Course(204,"Dot net"));
		
	}*/
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		/*
		Course c=null;
		for(Course course: list ) {
			if(course.getId()==CourseId) {
				c=course;
				break;
			}
		}*/
		return courseDao.getOne(courseId);
	} 
	
    //adding the course
	@Override
	public Course addCourse(Course course) {

		courseDao.save(course);
//		list.add(course);
		
		return course;
	}
	
//	public Course updateCourse()
//	
//	public Course deleteCourse(long parseLong) {
//		Course entity=courseDao.getOne(course);
//	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
		
		
	}

	
}
