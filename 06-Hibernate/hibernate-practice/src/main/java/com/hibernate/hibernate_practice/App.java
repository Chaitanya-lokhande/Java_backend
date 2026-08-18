package com.hibernate.hibernate_practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.hibernate_practice.entities.Student;
import com.hibernate.hibernate_practice.util.HibernateUtil;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ///student create
        /// save : hibernate
        Student student1 = new Student();
        student1.setName("Chaitanya Lokhande");
        student1.setCollege("Sanjivani Kopargaon");
        student1.setPhone("9689479281");
        student1.setFatherName("Sunil");
        student1.setActive(true);
        student1.setAbout("Hello I am Chaitanya Lokhande..");
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session =  sessionFactory.openSession();
        
        Transaction transaction = null;
        
        try {
        	transaction = session.beginTransaction();
        	session.persist(student1);
        	transaction.commit();
        	System.out.println("Student data saved successfully in the database..");
        }
        catch(Exception e){
        	if(transaction!=null) {
        		transaction.rollback(); 
        	}
        	e.printStackTrace();
        }
        session.close();
        
//        System.out.println(sessionFactory);
        
        
    }
}
