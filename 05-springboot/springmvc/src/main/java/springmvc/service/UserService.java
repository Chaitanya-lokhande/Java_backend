package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.UserDetails;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	public int CreateUser(UserDetails userDetails) {
		return this.userDao.saveUser(userDetails);
	}
}
