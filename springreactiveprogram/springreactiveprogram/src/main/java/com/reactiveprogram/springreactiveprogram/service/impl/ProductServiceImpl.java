package com.reactiveprogram.springreactiveprogram.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.reactiveprogram.springreactiveprogram.entity.Product;
import com.reactiveprogram.springreactiveprogram.repositories.ProductRepositories;
import com.reactiveprogram.springreactiveprogram.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProductServiceImpl implements ProductService {
    @Autowired
	private ProductRepositories productRepositories;
	@Override
	public Mono<Product> create(Product Product) {
		// TODO Auto-generated method stub
		Mono<Product> createdProduct=productRepositories.save(Product);
		return createdProduct;
	}

	@Override
	public Flux<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepositories.findAll();
	}

	@Override
	public Mono<Product> get(int productid) {
		// TODO Auto-generated method stub
		Mono<Product> item=productRepositories.findById(productid);
		return item;
	}

	@Override
	public Mono<Product> update(Product product, int Productid) {
		// TODO Auto-generated method stub
		Mono<Product> oldproduct=productRepositories.findById(Productid);
		return oldproduct.flatMap(p->{
			p.setPrice(product.getPrice());
			p.setDescription(product.getDescription());
			return productRepositories.save(p);
		});
		 
	}

	@Override
	public Mono<Void> delete(int Productid) {
		// TODO Auto-generated method stub
		return productRepositories.findById(Productid)
				.flatMap(p->productRepositories.delete(p));
		 
	}

	@Override
	public Flux<Product> search(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
