package com.springcore.orm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import com.springcore.orm.entities.Student;

@Transactional
public class StudentDao {
	public SessionFactory sessionFactory;
	
	public String insert(Student student) {
		
		Session session = this.sessionFactory.getCurrentSession();
		
		//Transaction transaction = null;
		//transaction = session.beginTransaction();
			
			session.persist(student);
			//transaction.commit();
			return("Data saved successfully..");
	}
	
	public Student getStudent(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, id);
		return student;
	}

	public List<Student> getAllStudents(){
		Session session = this.sessionFactory.getCurrentSession();
		Query<Student> query = session.createQuery("FROM Student",Student.class);
		return query.getResultList();
	}
	
	public void deleteStudent(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		session.remove(getStudent(id));
	}
	
	public void updateStudent(Student student) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(session);
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
