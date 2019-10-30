package com.example.sevice;

import java.util.List;

import com.example.entity.StudentEntity;
import com.example.model.Student;

public interface StudentService {

	public String stuSave(Student stu);

	public List<Student> getAll();

}
