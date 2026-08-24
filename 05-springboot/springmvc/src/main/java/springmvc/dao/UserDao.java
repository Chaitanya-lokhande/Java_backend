package springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.UserDetails;

@Repository
@Transactional
public class UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public int saveUser(UserDetails userDetails) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(userDetails);
		return 1;
	}
}
