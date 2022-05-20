package com.demo.springbootdemo1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springbootdemo1.Entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Long> {

}
