package question2.utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import question2.entity.Person;
import question2.entity.Student;
import question2.entity.Teacher;

public class SessionFactoryProvider {
    private static final SessionFactory sessionFactory ;
    static {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Teacher.class)
                .addAnnotatedClass(Student.class)
                .buildMetadata()
                .buildSessionFactory();

    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
