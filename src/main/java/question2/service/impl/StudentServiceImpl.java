package question2.service.impl;

import question2.entity.Person;
import question2.entity.Student;
import question2.entity.Teacher;
import question2.repository.PersonRepository;
import question2.repository.StudentRepository;
import question2.service.StudentService;

    public class StudentServiceImpl extends PersonServiceImpl<Student, StudentRepository> implements StudentService {
        public StudentServiceImpl(StudentRepository personRepository) {
            super(personRepository);
        }

        @Override
        public Student signUp(String firstName, String lastName, Integer studentNumber) {
            if (!personRepository.contains(firstName,lastName)){
                Student student = new Student();
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setStudentNumber(studentNumber);
                personRepository.save(student);
                return student;
            }
            return null;
        }
    }

