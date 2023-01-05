package com.example.baithiketthucmodule3.Model;

import java.sql.Date;
import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String Address;
    private String phone;
    private String email;
    private int classroom;

    public Student(int id, String name, LocalDate dateOfBirth, String address, String phone, String email, int classroom) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Address = address;
        this.phone = phone;
        this.email = email;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return Date.valueOf(dateOfBirth);
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
}
