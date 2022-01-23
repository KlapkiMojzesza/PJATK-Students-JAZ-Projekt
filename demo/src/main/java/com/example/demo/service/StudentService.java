package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    private IStudentRepository iStudentRepository;

    public StudentService(IStudentRepository iStudentRepository) {
        super();
        this.iStudentRepository = iStudentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return iStudentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return iStudentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return iStudentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return iStudentRepository.save(student);
    }

    @Override
    public List<Student> getStudentsByGroup(int group) {
        return iStudentRepository.findStudentsByGroup(String.valueOf(group));
    }

    @Override
    public void deleteStudentById(Long id) {
        iStudentRepository.deleteById(id);
    }
}
