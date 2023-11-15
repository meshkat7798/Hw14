package question2.service.impl;

import question2.entity.Person;
import question2.entity.Teacher;
import question2.repository.PersonRepository;
import question2.repository.TeacherRepository;
import question2.service.TeacherService;

import java.util.List;

public class TeacherServiceImpl extends PersonServiceImpl<Teacher, TeacherRepository> implements TeacherService {
    public TeacherServiceImpl(TeacherRepository personRepository) {
        super(personRepository);
    }

    @Override
    public Teacher signUp(String firstName, String lastName, Integer teacherNumber) {
        if (!personRepository.contains(firstName,lastName)){
            Teacher teacher = new Teacher();
            teacher.setFirstName(firstName);
            teacher.setLastName(lastName);
            teacher.setTeacherNumber(teacherNumber);
            personRepository.save(teacher);
            return teacher;
        }
        return null;
    }
}

