package com.example.sevice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentEntity;
import com.example.model.Student;
import com.example.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo stuRepo;
	
	
	
	
	@Override
	public String stuSave(Student stu) {
		StudentEntity sm=new StudentEntity();
		BeanUtils.copyProperties(stu, sm);		
		StudentEntity st=stuRepo.save(sm);
            	
		return "Registred sucessfully "+st.getStudentName();
	}




	@Override
	public List<Student> getAll() {
		 List<StudentEntity> al=(List<StudentEntity>) stuRepo.findAll();
		ArrayList<Student> sm=new ArrayList<>(al.size());
		 for(StudentEntity se:al) {
			 Student st=new Student ();
			 BeanUtils.copyProperties(se, st);
			 sm.add(st);
		 }
		return sm;
	}

}
