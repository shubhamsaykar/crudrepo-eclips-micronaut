package com.techno.Controller;

import java.util.List;

import javax.inject.Inject;

import com.techno.Model.Student;
import com.techno.Repository.StudentRepository;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/student")
public class StudentController {

	@Inject
	public StudentRepository studentRepository;
	
	List<Student> students;
	
	
	@Get
	public List<Student> getstudents(){
		return (List<Student>) studentRepository.findAll();
	}
	
	@Post
	public Student addUser(@Body Student students) {
		
		return studentRepository.save(students);
		
	}
	
}
