package com.springrestpractice.springrestpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestpractice.springrestpractice.Product;
import com.springrestpractice.springrestpractice.services.ProductServiceIntr;


@RestController
public class Controller {

	@Autowired
	private ProductServiceIntr productService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Home Page";
	}
	
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return this.productService.getProducts();
		
	}
	

	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable String productId) {
		return this.productService.getProduct(Long.parseLong(productId));
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return this.productService.addProduct(product);
	}
	
	
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product) {
		return this.productService.updateProduct(product);
	}
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId){
		try {
			this.productService.deleteProduct(Long.parseLong(productId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
