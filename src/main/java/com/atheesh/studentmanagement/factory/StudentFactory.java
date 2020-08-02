package com.atheesh.studentmanagement.factory;

import com.atheesh.studentmanagement.dto.StudentDTO;
import com.atheesh.studentmanagement.Entity.Student;
import org.springframework.beans.BeanUtils;

public class StudentFactory {

    public static Student convertToEntity(StudentDTO recStudent){
        Student student = new Student();
        BeanUtils.copyProperties(recStudent, student);
        return student;
    }

    public static StudentDTO convertToDTO(Student recStudent){
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(recStudent, studentDTO);
        return studentDTO;
    }
}
