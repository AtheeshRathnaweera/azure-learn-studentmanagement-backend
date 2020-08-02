package com.atheesh.studentmanagement.service.impl;

import com.atheesh.studentmanagement.dto.StudentDTO;
import com.atheesh.studentmanagement.factory.DTOToEntityFactory;
import com.atheesh.studentmanagement.factory.EntityToDTOFactory;
import com.atheesh.studentmanagement.Entity.Student;
import com.atheesh.studentmanagement.repository.StudentRepository;
import com.atheesh.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<StudentDTO> getAll() {
        List<Student> allStudents = studentRepository.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();

        for(Student student : allStudents){
            studentDTOList.add(EntityToDTOFactory.student(student));
        }

        return studentDTOList;
    }

    @Override
    public StudentDTO getById(int id) {
        Optional<Student> recStudent = studentRepository.findById(id);

        if (recStudent.isPresent()) {
            return EntityToDTOFactory.student(recStudent.get());
        } else {
            return null;
        }
    }

    @Override
    public StudentDTO save(StudentDTO newStudent) {
        Date nowDate = new Date();

        newStudent.setDate_created(nowDate);
        newStudent.setLast_updated(nowDate);

        Student student = studentRepository.save(DTOToEntityFactory.student(newStudent));

        return EntityToDTOFactory.student(student);
    }

    @Override
    public StudentDTO update(int id,StudentDTO newStudent) {
        Date nowDate = new Date();

        newStudent.setLast_updated(nowDate);
        Student updatedStudent = DTOToEntityFactory.student(newStudent);
        updatedStudent.setIdstudent(id);

        Student changedStudent = studentRepository.save(updatedStudent);

        return EntityToDTOFactory.student(changedStudent);
    }

    @Override
    public boolean delete(int id) {
        studentRepository.deleteById(id);
        return true;
    }
}
