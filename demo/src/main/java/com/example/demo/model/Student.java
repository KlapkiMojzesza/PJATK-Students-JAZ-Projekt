package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "studentindex", nullable = false)
    private Integer studentindex;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;


    public Student(){

    }

    public Student(int studentindex, String name, String surname, String email) {
        this.studentindex = studentindex;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setStudentIndex(Integer studentindex) {
        this.studentindex = studentindex;
    }

    public Integer getStudentIndex() {
        return studentindex;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
