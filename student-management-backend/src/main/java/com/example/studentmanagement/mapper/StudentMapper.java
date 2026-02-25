package com.example.studentmanagement.mapper;

import com.example.studentmanagement.dto.StudentDTO;
import com.example.studentmanagement.entity.Student;

public class StudentMapper {

    public static StudentDTO toDTO(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        return dto;
    }

    public static Student toEntity(StudentDTO dto) {
        Student student = new Student();
        student.setId(dto.getId());
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        return student;
    }
}