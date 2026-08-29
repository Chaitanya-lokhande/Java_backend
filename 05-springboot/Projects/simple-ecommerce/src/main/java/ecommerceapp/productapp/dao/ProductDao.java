package ecommerceapp.productapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ecommerceapp.productapp.model.Product;

@Component
@Transactional
public class ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(product);
	}
	
	public List<Product> getAllProducts() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("Select p FROM Product p", Product.class)
                .getResultList();
	}
	
	public Product getProduct(int pId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Product.class, pId);
	}
	
	public void deleteProduct(int pId) {
		Session session = sessionFactory.getCurrentSession();
		session.remove(getProduct(pId));
	}
	
	public void updateProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(product);
	}
	
	
}
