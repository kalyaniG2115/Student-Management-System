package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    // Constructor Injection (Recommended)
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // GET all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // ADD student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // GET student by id
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    // UPDATE student
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);

        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());

        return studentRepository.save(student);
    }

    // DELETE student
    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }
}
