package com.school.student.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class StudentVO {

	private int id;

	private String name;

	private String className;

	private Date dateOfBirth;

	private Date dateOfJoining;

}
