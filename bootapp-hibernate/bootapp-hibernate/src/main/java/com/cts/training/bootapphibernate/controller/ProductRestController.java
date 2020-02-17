package com.cts.training.bootapphibernate.controller;

import java.util.List;

import org.hibernate.PropertyNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.bootapphibernate.entity.Product;
import com.cts.training.bootapphibernate.services.IProductService;





@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class ProductRestController {
	
	// dependency
	@Autowired
	private IProductService productService;
	
	// @RequestMapping(value =  "/students", method = {RequestMethod.GET, RequestMethod.PUT} )
	@GetMapping("/products") // GET HTTP VERB
	public List<Product> exposeAll() {
		
		List<Product> products = this.productService.findAllProducts();
		
		return products;
	}
	
	// {<data variable>}
	@GetMapping("/products/{productId}") // GET HTTP VERB
	public Product getById(@PathVariable Integer productId) {
		
		Product product = this.productService.findProductById(productId);
		if(product == null)
			throw new PropertyNotFoundException("Product with id-" + productId + " not Found");
		return product;
	}
	
	// @RequestMapping(value =  "/students", method = RequestMethod.POST)
	@PostMapping("/products") // POST HTTP VERB
	public Product save(@RequestBody Product product) {
		this.productService.addProduct(product);
		return product;
	}
	
	@PutMapping("/products/{productId}")
	public ResponseEntity<Product> saveUpdate(@PathVariable Integer productId ,@RequestBody Product product) {
		Product p=new Product(productId,product.getName(),product.getCategory(),product.getCost());
		if(!this.productService.updateProduct(product))
			throw new RuntimeException("Could not update record!!!");
		ResponseEntity<Product> response = 
				new ResponseEntity<Product>(product, HttpStatus.OK);

		return response;
	}

	
	@DeleteMapping("/products/{productId}")
	public Product delete(@PathVariable Integer productId) {
		
		Product product = this.productService.findProductById(productId);
		
		// send studentId to DAO via SERVICE
		this.productService.deleteProduct(productId);
		
		return product;
	}
	
	// for exception handling
	
	
	
	
	/************ REST endpoints ************/
	// /api/student [GET]
	// /api/student/id [GET]
	// /api/student [POST]
	// /api/student [PUT]
	// /api/student/id [DELETE]
	
	
	
	
}
