package question2.repository.impl;

import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;
import question2.entity.Person;
import question2.entity.Teacher;
import question2.repository.PersonRepository;
import question2.repository.TeacherRepository;

import java.util.List;

public class TeacherRepositoryImpl extends PersonRepositoryImpl<Teacher> implements TeacherRepository {
    public TeacherRepositoryImpl(Session session) {
        super(session);
    }
    @Override
    public String getEntityTableName() {
        return Teacher.TABLE_NAME;
    }
    @Override
    public Class<Teacher> getEntityClass(){
        return Teacher.class;
    }
}
