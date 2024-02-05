package com.abi.quizeapp.service;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Service;

import dao.QuestionDao;


@Service
public class QuestionService {

	public static List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

}
