package com.pmc.inventory.service.adapters.out.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pmc.inventory.service.adapters.out.repository.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
