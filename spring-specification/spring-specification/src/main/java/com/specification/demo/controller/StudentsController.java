package com.specification.demo.controller;

import com.specification.demo.dto.*;
import com.specification.demo.entity.Student;
import com.specification.demo.mapper.StudentMapper;
import com.specification.demo.repository.StudentRepository;
import com.specification.demo.service.FilterSpecification;
import com.specification.demo.service.StudentServiceCriteriaQuery;
import com.specification.demo.specification.StudentSpecification;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.coyote.Response;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@AllArgsConstructor
public class StudentsController {
    private StudentRepository studentRepository;
    private StudentServiceCriteriaQuery studentServiceCriteriaQuery;

    @GetMapping("/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable(name="name") String name) {
//        StudentDto studentDto = StudentMapper.toStudentDto(studentRepository.findStudentByNameLike(name));

//        return ResponseEntity.ok(studentDto);
        return ResponseEntity.ok(studentRepository.findStudentByNameLike(name));
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<StudentDto>> getStudentByCity(@PathVariable(name="city") String city) {
        List<StudentDto> studentDtos = studentRepository.findByAddressCity(city).stream().map(StudentMapper::toStudentDto).toList();

        return ResponseEntity.ok(studentDtos);
    }

    @GetMapping("/subject/{name}")
    public List<Student> getStudentBySubject(@PathVariable(name="name") String name) {
        return studentRepository.findBySubjectName(name);
    }

    @GetMapping("/specification/{name}")
    public ResponseEntity<List<StudentDto>> getStudentByNameSpecification(@PathVariable(name="name") String name) {

        Specification<Student> St = Specification.where(StudentSpecification.nameLike(name));
        List<Student> students = studentRepository.findAll(St);
        List<StudentDto> studentDtos = students.stream().map(StudentMapper::toStudentDto).toList();

        return ResponseEntity.ok(studentDtos);
    }

    @PostMapping("/specification")
    public ResponseEntity<List<StudentDto>> getStudentByNameSpecification(@RequestBody FilterDto request) {

        Specification<Student> St = FilterSpecification.getFilterSpecification(request);
        List<Student> students = studentRepository.findAll(St);
        List<StudentDto> studentDtos = students.stream().map(StudentMapper::toStudentDto).toList();

        return ResponseEntity.ok(studentDtos);
    }

    @PostMapping("/specification/multiple")
    public ResponseEntity<List<StudentDto>> getStudentByNameSpecification(@RequestBody RequestDto request) {

        Specification<Student> St = FilterSpecification.getFilterSpecification(request);
        List<Student> students = studentRepository.findAll(St);
        List<StudentDto> studentDtos = students.stream().map(StudentMapper::toStudentDto).toList();

        return ResponseEntity.ok(studentDtos);
    }

    @PostMapping("/pagination")
    public ResponseEntity<List<StudentDto>> getStudentByPagination(@RequestBody PageRequestDto request) {

        Pageable pageable = request.getPageRequest();

        List<Student> students = studentRepository.findAll(pageable).toList();


        return ResponseEntity.ok(students.stream().map(StudentMapper::toStudentDto).toList());
    }

    @PostMapping("/pagination/methodQuery/{city}")
    public ResponseEntity<List<StudentDto>> getStudentByPagination(@RequestBody PageRequestDto request, @PathVariable(name="city") String city) {

        Pageable pageable = request.getPageRequest();

        Page<Student> students = studentRepository.findByAddressCity(city, pageable);


        return ResponseEntity.ok(students.stream().map(StudentMapper::toStudentDto).toList());
    }




    @PostMapping("/pagination/onlist")
    public ResponseEntity<List<StudentDto>> getStudentByPaginationOnList(@RequestBody PageRequestDto request) {
        //In this implementation we are using PagedListHolder to paginate the list of students from the Java List
        //Not performance wise good but it is just to show how we can paginate the list
        List<Student> studentList = studentRepository.findAll();

        //1. PageListHolder
        PagedListHolder<Student> pagedListHolder = new PagedListHolder<>(studentList);
        pagedListHolder.setPageSize(request.getSize());
        pagedListHolder.setPage(request.getPage());

        //2 Property Comparator
        List<Student> pageSlice = pagedListHolder.getPageList();
        boolean acending = request.getSort().isAscending();
        PropertyComparator.sort(pageSlice, new MutableSortDefinition(request.getSortBy(), true, acending));

        //3. PageImple
        Page<Student> students = new PageImpl<>(pageSlice, PageRequest.of(request.getPage(), request.getSize()), studentList.size());


        return ResponseEntity.ok(students.stream().map(StudentMapper::toStudentDto).toList());
    }


    @PostMapping("/search/criteriaQuery")
    public ResponseEntity<List<StudentDto>> getStudentBySearch(@RequestBody StudentRequestDto studentDto) {


        List<Student>  filtredStudentList = this.studentServiceCriteriaQuery.getStudents(studentDto);

        List<StudentDto> studentDtos = filtredStudentList.stream().map(StudentMapper::toStudentDto).toList();


        return ResponseEntity.ok(studentDtos);
    }


}
