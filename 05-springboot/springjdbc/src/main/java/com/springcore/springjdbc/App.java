package com.springcore.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springjdbc.dao.StudentDaoImple;
import com.springcore.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        StudentDaoImple studentDaoImple = context.getBean("studentDaoImple", StudentDaoImple.class);
        
        Student student = new Student();
        student.setId(768);
        student.setName("Jassi Gore");
        student.setCity("Delhi");
        
        int result = studentDaoImple.insert(student);
        
        System.out.println("number of record inserted -> " + result);
        
//        int updateRes = studentDaoImple.change(student);
//        System.out.println("number of record updated -> " + updateRes);
        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Enter Id of student to delete : ");
//        int inputId = sc.nextInt();
//        int deleteRes = studentDaoImple.delete(inputId);
//        System.out.println("number of entries deleted -> " + deleteRes);
        //Student student1 = studentDaoImple.getStudent(233);
        
        //System.out.println(student1);
        
        List<Student> students = studentDaoImple.getAllStudents();
        System.out.println(students);
        
        
    }
}
