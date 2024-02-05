package com.abi.quizeapp.controller;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Question {

	private Integer id;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String difficultylevel;
	private String rightAnswer;
	
}
