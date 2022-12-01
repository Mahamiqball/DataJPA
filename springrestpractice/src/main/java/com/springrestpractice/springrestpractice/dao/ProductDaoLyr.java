package com.springrestpractice.springrestpractice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestpractice.springrestpractice.Product;

public interface ProductDaoLyr extends JpaRepository<Product,Long> {

}
