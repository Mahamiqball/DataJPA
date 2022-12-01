package com.springrestpractice.springrestpractice.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestpractice.springrestpractice.Product;
import com.springrestpractice.springrestpractice.dao.ProductDaoLyr;


@Service
public class ProductServiceIntrImpl implements ProductServiceIntr {

	@Autowired
	private ProductDaoLyr productDaoLyr;
	
//	List<Course> list;
	public ProductServiceIntrImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(01,"Java Core","This a main JavaCore Course"));
//		list.add(new Course(02,"Java advanced","Here you will study advanced java"));
		
	} 
	
	@Override
	public List<Product> getProducts() {
		
		return productDaoLyr.findAll();
	}
	
	
//	@SuppressWarnings("deprecation")
	@Override
	public Product getProduct(long productId) {
//		Course c = null;
//		
//		for (Course course:list) {
//			if(course.getId()==courseId) {
//				c= course;
//				break;
//			}
//		}
		return productDaoLyr.getReferenceById(productId);
	}


	@Override
	public Product addProduct(Product product){
//		list.add(course);
		productDaoLyr.save(product);
		return product;
	}


	@Override
	public Product updateProduct(Product product) {
//		list.forEach(e-> {
//			if(e.getId()==Product.getId()) {
//				e.setProName(Product.getProName());
//				e.setProDescrip(Product.getProDescrip());
//			}
//		});
		
		productDaoLyr.save(product);
		
		
		
		return product;
	}

	@Override
	public void deleteProduct(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Product entity = productDaoLyr.getReferenceById(parseLong);
		productDaoLyr.delete(entity);
	}


 
}
