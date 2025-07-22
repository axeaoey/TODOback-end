package com.sicr.train.service.impl;

import com.sicr.train.data.StudentRepository;
import com.sicr.train.data.entity.Student;
import com.sicr.train.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> update(Long id, Student updatedStudent) {
        return studentRepository.findById(id).map(student -> {
            student.setStudentCode(updatedStudent.getStudentCode());
            student.setFirstName(updatedStudent.getFirstName());
            student.setLastName(updatedStudent.getLastName());
            student.setDateOfBirth(updatedStudent.getDateOfBirth());
            student.setGender(updatedStudent.getGender());
            student.setProvince(updatedStudent.getProvince());
            student.setAddress(updatedStudent.getAddress());
            student.setEmail(updatedStudent.getEmail());
            return studentRepository.save(student);
        });
    }

    @Override
    public boolean delete(Long id) {
        if (!studentRepository.existsById(id)) return false;
        studentRepository.deleteById(id);
        return true;
    }
}
