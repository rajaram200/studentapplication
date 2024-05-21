package com.school.student.service;

import org.springframework.stereotype.Service;

import com.school.student.vo.StudentVO;

public interface StuderService {
	
	public StudentVO save(StudentVO studentVO);
	
	public StudentVO update(StudentVO studentVO,int studentId);
	
	public StudentVO fetch(int studentId);

}
