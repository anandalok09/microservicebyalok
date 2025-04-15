package com.reactiveprogram.springreactiveprogram.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.reactiveprogram.springreactiveprogram.entity.Product;

import reactor.core.publisher.Flux;
@Repository
public interface ProductRepositories extends ReactiveCrudRepository<Product, Integer>{

	Flux<Product> findByDescription(String desc);
}
