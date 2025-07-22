package com.sicr.train.service;

import com.sicr.train.data.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student create(Student student);
    List<Student> getAll();
    Optional<Student> update(Long id, Student student);
    boolean delete(Long id);
}
