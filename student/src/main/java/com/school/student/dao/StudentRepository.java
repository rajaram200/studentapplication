package com.school.student.dao;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.student.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Modifying
	@Transactional
	@Query(value="update student set name =:name,className = :className,dateOfBirth = :dateOfBirth , dateOfJoining = :dateOfJoining where id = :id",nativeQuery = true)
	void update(@Param("name") String name,@Param("className") String className,
			@Param("dateOfBirth") Date dateOfBirth,@Param("dateOfJoining") Date dateOfJoining,@Param("id") Integer id);

}
