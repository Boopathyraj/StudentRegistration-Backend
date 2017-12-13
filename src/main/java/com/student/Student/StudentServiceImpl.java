package com.student.Student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;
	@Override
	public Student save(Student bean) {
		return repo.saveAndFlush(bean);
	}

	@Override
    public List<Student> getAll() {
        // TODO Auto-generated method stub
        //System.out.println(repo.findAll());
        return repo.findAll();
    }
	

}