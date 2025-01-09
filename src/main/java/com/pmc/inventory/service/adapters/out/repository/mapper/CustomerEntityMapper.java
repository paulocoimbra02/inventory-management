package com.pmc.inventory.service.adapters.out.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.pmc.inventory.service.adapters.out.repository.entity.ProductEntity;
import com.pmc.inventory.service.application.core.domain.ProductContext;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

	@Mapping(source="product", target=".")
	ProductEntity toProductEntity(ProductContext productContext);
}
