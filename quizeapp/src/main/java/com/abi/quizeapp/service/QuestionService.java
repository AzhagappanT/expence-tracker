package com.abi.quizeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abi.quizeapp.controller.Question;

import dao.QuestionDao;


@Service
public class QuestionService {
     
	 @Autowired
	 QuestionDao questionDao;
	 
	public List<Question> getAllQuestions() {
		return  questionDao.findAll();
	}

}
