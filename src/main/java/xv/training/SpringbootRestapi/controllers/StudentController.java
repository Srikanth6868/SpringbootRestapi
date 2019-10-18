package xv.training.SpringbootRestapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.SpringbootRestapi.entities.Student;
import xv.training.SpringbootRestapi.repositories.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired //it will nt create a memory allocation for the instance coz we r nt using new.
	private StudentRepository studentRepository;
	
	@RequestMapping("/students")
	private Iterable<Student> getstudents(){
		return studentRepository.findAll();
		
	}

}
