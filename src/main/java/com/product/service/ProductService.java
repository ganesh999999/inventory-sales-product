package com.product.service;

import java.util.List;
import java.util.Optional;

import com.product.entity.Product;

public interface ProductService {
	public void createProduct(Product product);

	public Optional<Product> getProductById(String productId);

	public List<Product> getProducts();
}
