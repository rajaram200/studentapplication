package com.school.student.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	private int id;
	
	private String name;
	
	private String className;
	
	private Date dateOfBirth;
	
	private Date dateOfJoining;
	
	
	

}
