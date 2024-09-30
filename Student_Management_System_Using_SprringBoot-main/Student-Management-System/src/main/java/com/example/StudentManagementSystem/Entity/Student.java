package com.example.StudentManagementSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "first_name", nullable = false)
	private String FirstName;
	@Column(name = "last_name")
	private String LastName;
	@Column(name = "email")
	private String Email;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long id, String firstName, String lastName, String email) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
	}

	
}
