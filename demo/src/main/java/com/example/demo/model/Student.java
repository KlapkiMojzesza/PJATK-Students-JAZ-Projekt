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

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "groupnumber", nullable = false)
    private Integer groupnumber;


    public Student(){

    }

    public Student(int studentindex, String name, String surname, String email, Integer groupnumber) {
        this.studentindex = studentindex;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.groupnumber = groupnumber;
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

    public Integer getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(Integer groupnumber) {
        this.groupnumber = groupnumber;
    }
}
