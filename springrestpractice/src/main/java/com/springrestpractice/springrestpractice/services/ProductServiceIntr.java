package com.springrestpractice.springrestpractice.services;

import java.util.List;

import com.springrestpractice.springrestpractice.Product;


public interface ProductServiceIntr {
	
	public List<Product> getProducts();
	
   public Product getProduct(long productId);
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(long parseLong);

}
