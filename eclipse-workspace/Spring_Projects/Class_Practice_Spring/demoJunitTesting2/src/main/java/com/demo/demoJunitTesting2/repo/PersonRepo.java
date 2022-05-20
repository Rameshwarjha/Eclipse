package com.demo.demoJunitTesting2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.demoJunitTesting2.Entity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {
	
	@Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM PERSON s WHERE s.personId = ?1")
	Boolean isPersonExistsById(Integer id);

}