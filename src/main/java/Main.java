import question2.entity.Person;
import question2.entity.Student;
import question2.entity.Teacher;
import question2.service.PersonService;
import question2.service.StudentService;
import question2.service.TeacherService;
import question2.utility.ApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        PersonService personService = ApplicationContext.getPersonService();
        StudentService studentService = ApplicationContext.getStudentService();
        TeacherService teacherService = ApplicationContext.getTeacherService();


//        Person person1 = personService.signUp("meshkat","hashemian");
//        Person person2 = personService.signUp("sama","boshagh");
//
        Student student1= studentService.signUp("meshi","hashemi",100);
//        Student student2= studentService.signUp("sajjad","hooshi",101);
//
//        Teacher teacher1 = teacherService.signUp("teacher1","aghili",1000);
//        Teacher teacher2 = teacherService.signUp("teacher2","mohammadi",1001);


 //       student1.setBirthDay(new Date("2020/10/12"));
//       studentService.update(student1,1);
//
//
 //      studentService.delete(13);
//
//
//        Student student = studentService.findById(14);
//        System.out.println(student);
//
//
//        List<Student> students = studentService.loadAll();
//        for (Student st:students) {
//            System.out.println(st);
//        }




//        boolean containsStudent = studentService.contains("student1","student111");
//        System.out.println(containsStudent);



    }
}