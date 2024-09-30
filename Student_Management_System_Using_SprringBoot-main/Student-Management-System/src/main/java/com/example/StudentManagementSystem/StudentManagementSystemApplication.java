package com.example.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.StudentManagementSystem.Entity.Student;
import com.example.StudentManagementSystem.Repository.StudentRepository;

@SpringBootApplication(scanBasePackages = "com.example.StudentManagementSystem.Controller")
@EnableJpaRepositories(basePackages = {"com.example.StudentManagementSystem.Repository"})
@EntityScan(basePackages = "com.example.StudentManagementSystem.Entity")
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository s;
	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student(2l,"vijay","Patil","vp111@gmail.com");
//		s.save(s1);
//		Student s2 = new Student(3l,"Sanjay","Patil","Sp111@gmail.com");
//		s.save(s2);
		
	}
}
 