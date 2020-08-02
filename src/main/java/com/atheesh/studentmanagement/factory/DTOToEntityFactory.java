package com.atheesh.studentmanagement.factory;

import com.atheesh.studentmanagement.dto.StudentDTO;
import com.atheesh.studentmanagement.Entity.Student;


public class DTOToEntityFactory {

    public static Student student(StudentDTO studentDTO){
        return (Student) ConversionFactory.conversion(studentDTO, new Student());
    }
}
