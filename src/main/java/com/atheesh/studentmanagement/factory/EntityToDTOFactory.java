package com.atheesh.studentmanagement.factory;


import com.atheesh.studentmanagement.dto.StudentDTO;
import com.atheesh.studentmanagement.Entity.Student;

public class EntityToDTOFactory {

    public static StudentDTO student(Student student){
        return (StudentDTO) ConversionFactory.conversion(student,new StudentDTO());
    }

}
