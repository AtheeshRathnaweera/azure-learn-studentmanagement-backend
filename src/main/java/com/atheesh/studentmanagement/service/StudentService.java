package com.atheesh.studentmanagement.service;

import com.atheesh.studentmanagement.dto.StudentDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    List<StudentDTO> getAll();
    StudentDTO getById(int id);
    StudentDTO save(StudentDTO newStudent);
    StudentDTO update(int id, StudentDTO newStudent);
    boolean delete(int id);

}
