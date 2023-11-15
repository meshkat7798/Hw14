package question2.repository.impl;

import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;
import question2.entity.Person;
import question2.entity.Student;
import question2.repository.PersonRepository;
import question2.repository.StudentRepository;

import java.util.List;

public class StudentRepositoryImpl extends PersonRepositoryImpl<Student> implements StudentRepository {
    public StudentRepositoryImpl(Session session) {
        super(session);
    }
    @Override
    public String getEntityTableName() {
        return Student.TABLE_NAME;
    }
    @Override
    public Class<Student> getEntityClass(){
        return Student.class;
    }
}


