package com.ibm.ditspringbootproject.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.ditspringbootproject.entities.Question;



public interface QuestionRepository extends JpaRepository<Question, Integer>{

//	List<Question> findAll();

	//Question save(Question question);

}