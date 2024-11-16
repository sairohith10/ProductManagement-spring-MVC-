package com.store.deals4u.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.deals4u.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
