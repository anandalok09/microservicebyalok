package com.reactiveprogram.springreactiveprogram.service;

import com.reactiveprogram.springreactiveprogram.entity.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

	public Mono<Product> create(Product Product);
	
	public Flux<Product> getAll();
	
	public Mono<Product> get(int productid);
	
	public Mono<Product> update(Product product, int Productid);
	
	public Mono<Void> delete(int Productid);
	public Flux<Product> search(String query);
}
