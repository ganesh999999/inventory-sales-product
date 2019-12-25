package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(Product product) {
		productRepository.saveAndFlush(product);
	}

	@Override
	public Optional<Product> getProductById(String productId) {
		Optional<Product> product = productRepository.findById(productId);
		return product;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = productRepository.findAll();
		return products;
	}

}
