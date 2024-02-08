package com.abi.quizeapp.controller;


import java.util.List;
import com.abi.quizeapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abi.quizeapp.controller.Question;

import com.abi.quizeapp.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
  @GetMapping("allQuestions")
	public List<Question> getAllQuestions(){
		return questionService.getAllQuestions();
	}
}
