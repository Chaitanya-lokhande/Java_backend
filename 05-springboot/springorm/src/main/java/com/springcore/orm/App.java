package com.springcore.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.orm.dao.StudentDao;
import com.springcore.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
       
       StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
       
       Student student1 = new Student(354, "Sai Lokhande", "Rampur");
       
       String r = studentDao.insert(student1);
       System.out.println(r);
    }
}
