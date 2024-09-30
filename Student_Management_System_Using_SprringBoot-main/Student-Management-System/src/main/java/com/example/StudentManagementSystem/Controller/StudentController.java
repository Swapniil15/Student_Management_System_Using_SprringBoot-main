package com.example.StudentManagementSystem.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentManagementSystem.Entity.Student;
import com.example.StudentManagementSystem.Repository.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	 
	@GetMapping("/students")
	public ModelAndView listStudent() {
		ModelAndView mv = new ModelAndView("students.html");
		mv.addObject("students", studentRepository.findAll());
		return mv;
		
	}
	
	public StudentController(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "createStudent";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentRepository.save(student);
		return "redirect:/students"; 
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student",studentRepository.getById(id));
		return "editStudent";
	}
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,Model model) 
	{
		Student existingStudent = studentRepository.getById(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		studentRepository.save(existingStudent);
		return "redirect:/students"; 
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentRepository.deleteById(id);
		return "redirect:/students"; 
	}
}
