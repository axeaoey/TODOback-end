package com.sicr.train.api;
import com.sicr.train.data.entity.Student;
import com.sicr.train.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @PostMapping
  public ResponseEntity<Student> create(@RequestBody Student student) {
    return ResponseEntity.ok(studentService.create(student));
  }

  @GetMapping
  public ResponseEntity<List<Student>> getAll() {
    return ResponseEntity.ok(studentService.getAll());
  }

  @PutMapping("/{id}")
  public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
    return studentService.update(id, student)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    return studentService.delete(id)
        ? ResponseEntity.noContent().build()
        : ResponseEntity.notFound().build();
  }
}
