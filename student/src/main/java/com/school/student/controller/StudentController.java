package com.school.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.student.service.StudentServiceImpl;
import com.school.student.service.StuderService;
import com.school.student.vo.StudentVO;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StuderService studentService;

	@PostMapping("/save")
	public ResponseEntity<StudentVO> save(@RequestBody StudentVO studentVO) {
		return new ResponseEntity<StudentVO>(studentService.save(studentVO), HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<StudentVO> update(StudentVO studentVO, @PathVariable("id") int studentId) {
		return new ResponseEntity<StudentVO>(studentService.update(studentVO, studentId), HttpStatus.ACCEPTED);
	}

	@GetMapping("/get")
	public ResponseEntity<StudentVO> fetch(@RequestParam("id") int studentId) {
		return new ResponseEntity<StudentVO>(studentService.fetch(studentId), HttpStatus.OK);
	}

}
