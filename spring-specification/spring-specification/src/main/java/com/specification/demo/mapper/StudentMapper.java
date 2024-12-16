package com.specification.demo.mapper;

import com.specification.demo.dto.StudentDto;
import com.specification.demo.entity.Address;
import com.specification.demo.entity.Student;

public class StudentMapper {
    public static StudentDto toStudentDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setAddress(student.getAddress().getCity());
        return studentDto;
    }

    public static Student toStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        Address address = new Address();
        address.setCity(studentDto.getAddress());
        student.setAddress(address);
        return student;
    }
}
