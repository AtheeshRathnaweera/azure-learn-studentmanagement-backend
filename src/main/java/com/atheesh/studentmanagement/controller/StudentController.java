package com.atheesh.studentmanagement.controller;

import com.atheesh.studentmanagement.dto.StudentDTO;
import com.atheesh.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/studentmanagement/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable("id") int id){
        return studentService.getById(id);
    }

    @GetMapping("/all")
    public List<StudentDTO> getAllStudentById(){
        System.out.println("get all students started");
        return studentService.getAll();
    }

    @PostMapping
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.save(studentDTO);
    }

    @PutMapping("/{id}")
    public StudentDTO updateStudent(@PathVariable("id") int id,@RequestBody StudentDTO studentDTO){
        return studentService.update(id,studentDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable("id") int id){
        return studentService.delete(id);
    }
}
