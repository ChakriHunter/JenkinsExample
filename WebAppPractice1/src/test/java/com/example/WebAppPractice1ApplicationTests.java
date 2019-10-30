package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Student;
import com.example.sevice.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebAppPractice1ApplicationTests {
   
	@Autowired
	StudentService ss;
	
	@Test
	@Ignore
	public void test_stuSave() {
		Student stu=new Student();
		stu.setStudentId(989);
		stu.setStudentName("Basava");
		String res=ss.stuSave(stu);
		//assertSame("Registred sucessfully "+stu.getStudentName(), res);
		assertEquals("Registred sucessfully "+stu.getStudentName(), res);
	}
	
	
	@Test
	public void test_getAll() {
		List<Student> res=ss.getAll();
		System.out.println("Size Of Student="+res.size());
		assertNotNull(res);
		assertEquals(3, res.size());
	}

}
