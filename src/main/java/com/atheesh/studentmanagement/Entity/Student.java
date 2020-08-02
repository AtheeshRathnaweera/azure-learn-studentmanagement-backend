package com.atheesh.studentmanagement.Entity;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idstudent")
    private int idstudent;

    @NotNull
    private String name;

    @NotNull
    private String email;

    private String phone;
    private String address;

    @NotNull
    private Date date_created;

    @NotNull
    private Date last_updated;

    public Student() {
    }

    public Student(@NotNull String name, @NotNull String email, String phone, String address, @NotNull Date date_created,
                   @NotNull Date last_updated) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.date_created = date_created;
        this.last_updated = last_updated;
    }

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idstudent=" + idstudent +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", date_created=" + date_created +
                ", last_updated=" + last_updated +
                '}';
    }
}
