package question2.service;

import question2.entity.Person;
import question2.entity.Teacher;

import java.util.List;

public interface TeacherService extends PersonService<Teacher>{
    Teacher signUp(String firstName, String lastName, Integer teacherNumber);
}
