package question2.service;

import question2.entity.Person;
import question2.entity.Student;

import java.util.List;

public interface StudentService extends PersonService<Student>{
    Student signUp(String firstName, String lastName,Integer studentNumber);
}