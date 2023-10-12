package com.cg.st;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServices {
	@Autowired
	private StudentRepository repository;
	
	public List<Student> listAll(){
		return repository.findAll();
	}
    public Student get(Integer id) {
    	return repository.findById(id).get();
    }
   public Student gethallticketno(Integer hallticketno) {
    	return repository.findById(hallticketno).get();
    }
    public void save(Student student) {
    	repository.save(student);	
    }
    public  void delete(Integer id) {
    	repository.deleteById(id);
    }

}
