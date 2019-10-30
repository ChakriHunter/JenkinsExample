package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;
import com.example.sevice.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService ss;

	@RequestMapping(value = "/sudnt")
	public String displayForm(Model model) {
		model.addAttribute("std", new Student());
		return "student";
	}

	@RequestMapping(value = "/submitStudent")
	public String subfor(@Valid @ModelAttribute("std") Student stu, BindingResult result, Model model) {
		System.out.println("MOdel Data=" + stu);
		if (result.hasErrors()) {
			return "student";
		}
		String name = ss.stuSave(stu);

		if (!name.isEmpty()) {
			model.addAttribute("msg", name);
		} else {
			model.addAttribute("msg", "Studnet Not Registered Sucessfully");
		}

		return "student";
	}

	/*
	 * @Scheduled(fixedDelay = 5000) public void subForm() { String a[] = {
	 * "Chakri", "David", "Roger", "Pant", "Dhoni", "Hunter", "Gabbar", "Don",
	 * "Smith", "AB", "Pogba", "Sadhguru", "Sapna Choudry", "Kholi", "Bullet" };
	 * Random ran=new Random(); Student st=new Student();
	 * st.setStudentName(a[ran.nextInt(15)]); String res=ss.stuSave(st);
	 * System.out.println("Result="+res); }
	 */

	@RequestMapping("/disStu")
	public String disData(Model model) {
		List<Student> allStudents = ss.getAll();
		model.addAttribute("allStu", allStudents);
		return "disStudent";
	}

}// end of class
