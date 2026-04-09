package com.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.students.entity.Student;

@Repository
public interface Studentrepositary extends JpaRepository<Student, Integer> {

}
