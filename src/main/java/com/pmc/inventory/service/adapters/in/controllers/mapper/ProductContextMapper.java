package com.pmc.inventory.service.adapters.in.controllers.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.pmc.inventory.service.adapters.in.controllers.dto.ProductRequest;
import com.pmc.inventory.service.application.core.domain.ProductContext;

@Mapper(componentModel = "spring")
public interface ProductContextMapper {

		@Mapping(target = "country", source = "country")
		@Mapping(target = "product", source = "productRequest")
		ProductContext toProductContext(ProductRequest productRequest, String country);

}
