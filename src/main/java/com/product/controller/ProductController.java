package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping
	public void createProduct(@RequestBody Product product) {
		productService.createProduct(product);
	}

	@GetMapping("/{productId}")
	public Optional<Product> getProductById(@PathVariable String productId) {
		Optional<Product> product = productService.getProductById(productId);
		return product;
	}

	@GetMapping
	public List<Product> getProducts() {
		List<Product> products = productService.getProducts();
		return products;
	}

}
