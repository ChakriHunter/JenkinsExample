package com.example.model;

import lombok.Data;

//import javax.validation.constraints.NotEmpty;
@Data
public class Student {

	
	private int studentId;
	//@NotEmpty(message="enter Name")
	private String studentName;
	


}
