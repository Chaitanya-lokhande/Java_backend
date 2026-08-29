package ecommerceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import ecommerceapp.productapp.dao.ProductDao;
import ecommerceapp.productapp.model.Product;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String getHome(Model m) {
		m.addAttribute("title","Product Management");
		List<Product> products = productDao.getAllProducts();
		m.addAttribute("product", products);
		return "index";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(Model m) {
		m.addAttribute("title","Add Product");
		return "add_product_form";
	}
	
	@RequestMapping(value = "/added-product", method = RequestMethod.POST)
	public RedirectView addedProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath()+"/");
		return rv;
	}
	
	@RequestMapping(value = "/delete/{productId}", method = RequestMethod.GET)
	public RedirectView deletedProduct(@PathVariable("productId") int productId ,HttpServletRequest request) {
		productDao.deleteProduct(productId);
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath()+"/");
		return rv;
	}
	
	@RequestMapping(value = "/update/{productId}", method = RequestMethod.GET)
	public String updateProduct(@PathVariable("productId") int productId ,HttpServletRequest request, Model m) {
		Product product = this.productDao.getProduct(productId);
		m.addAttribute(product);
		return "updateProduct";
	}
	
	@RequestMapping(value = "/update/updated/{productId}", method = RequestMethod.POST)
	public RedirectView updatedProduct(@PathVariable("productId") int productId ,@ModelAttribute Product product, HttpServletRequest request) {
		product.setpId(productId);
		productDao.updateProduct(product);
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath()+"/");
		return rv;
	}
	
}
