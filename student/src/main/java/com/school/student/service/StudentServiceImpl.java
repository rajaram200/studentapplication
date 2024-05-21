package com.school.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.student.dao.StudentRepository;
import com.school.student.entity.Student;
import com.school.student.vo.StudentVO;

@Service
public class StudentServiceImpl implements StuderService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public StudentVO save(StudentVO studentVO) {
		Student student = objectMapper.convertValue(studentVO, Student.class);
		student = studentRepository.save(student);
		return objectMapper.convertValue(student, StudentVO.class);
	}

	@Override
	public StudentVO update(StudentVO studentVO, int studentId) {
		Student student = objectMapper.convertValue(studentVO, Student.class);
		studentRepository.update(student.getName(),student.getClassName(),student.getDateOfBirth(),
				student.getDateOfJoining(),student.getId());
		return objectMapper.convertValue(student, StudentVO.class);
	}

	@Override
	public StudentVO fetch(int studentId) {
		Student student = studentRepository.findById(studentId).orElse(new Student());
		return objectMapper.convertValue(student, StudentVO.class);
	}

}
