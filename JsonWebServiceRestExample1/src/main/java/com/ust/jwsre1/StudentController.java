package com.ust.jwsre1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.jwsre1.dao.StudentRepo;

@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;
	
	@PostMapping("/student")
	public Students addStudent(@RequestBody Students student) {
		return repo.save(student);
	}
	
	@GetMapping("/student")
	public List<Students> getStudent(){
		return repo.findAll();
	}
	
	@GetMapping("/student/{sId}")
	public Optional<Students> getStudentById(@PathVariable("sId") int sId){
		return repo.findById(sId);
	}
	
	@PutMapping("/student")
	public Students editStudent(@RequestBody Students student) {
		return repo.save(student);
	}
	
	@DeleteMapping("/student/{sId}")
	public void deleteStudentById(@PathVariable("sId") int sId){
		repo.deleteById(sId);
	}
	
}
