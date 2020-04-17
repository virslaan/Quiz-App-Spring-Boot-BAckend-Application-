package com.ibm.ditspringbootproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.ditspringbootproject.entities.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer>{
	public Quiz findByName(String name);

	
}