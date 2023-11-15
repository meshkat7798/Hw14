package question2.utility;

import org.hibernate.Session;
import question2.repository.PersonRepository;
import question2.repository.StudentRepository;
import question2.repository.TeacherRepository;
import question2.repository.impl.PersonRepositoryImpl;
import question2.repository.impl.StudentRepositoryImpl;
import question2.repository.impl.TeacherRepositoryImpl;
import question2.service.PersonService;
import question2.service.StudentService;
import question2.service.TeacherService;
import question2.service.impl.PersonServiceImpl;
import question2.service.impl.StudentServiceImpl;
import question2.service.impl.TeacherServiceImpl;


public class ApplicationContext {
    private static Session session;
    private static final PersonRepository PERSON_REPOSITORY;
    private static final StudentRepository STUDENT_REPOSITORY;
    private static final TeacherRepository TEACHER_REPOSITORY;
    private static final PersonService PERSON_SERVICE;
    private static final StudentService STUDENT_SERVICE;
    private static final TeacherService TEACHER_SERVICE;
    static {
        session = SessionFactoryProvider.getSessionFactory().openSession();
        PERSON_REPOSITORY = new PersonRepositoryImpl(session);
        PERSON_SERVICE = new PersonServiceImpl(PERSON_REPOSITORY);
        STUDENT_REPOSITORY = new StudentRepositoryImpl(session);
        STUDENT_SERVICE = new StudentServiceImpl(STUDENT_REPOSITORY);
        TEACHER_REPOSITORY = new TeacherRepositoryImpl(session);
        TEACHER_SERVICE = new TeacherServiceImpl(TEACHER_REPOSITORY);
    }

    public static PersonService getPersonService(){
        return PERSON_SERVICE;
    }
    public static StudentService getStudentService(){
        return STUDENT_SERVICE;
    }
    public static TeacherService getTeacherService(){
        return TEACHER_SERVICE;
    }



}