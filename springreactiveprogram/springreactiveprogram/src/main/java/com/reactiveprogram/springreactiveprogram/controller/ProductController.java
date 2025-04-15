package com.reactiveprogram.springreactiveprogram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactiveprogram.springreactiveprogram.entity.Product;
import com.reactiveprogram.springreactiveprogram.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("product")
public class ProductController {
@Autowired
	private ProductService productService;

public Mono<Product> create(@RequestBody Product product){
	return productService.create(product);
	
}
@GetMapping
public Flux<Product> getAll(){
	return productService.getAll();
}

@GetMapping("/{productid}")
public Mono<Product> get(@PathVariable int productid){
return productService.get(productid);
}

@PutMapping("/{productid}")
public Mono<Product> update(@RequestBody Product product, @PathVariable int productid){
	return productService.update(product, productid);
}

@PutMapping("/{productid}")
public Mono<Void> delete(@PathVariable int productid){
	return productService.delete(productid);
	
}
}