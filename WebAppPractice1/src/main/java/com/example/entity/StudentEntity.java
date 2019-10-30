package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "STUDNET_REG")
@Data
public class StudentEntity {

	@Id
	@GeneratedValue
	@Column(name = "stu_id")
	private int studentId;

	@Column(name = "stu_name")
	private String studentName;


}
