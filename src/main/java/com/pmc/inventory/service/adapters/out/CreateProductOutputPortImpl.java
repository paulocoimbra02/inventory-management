package com.pmc.inventory.service.adapters.out;

import org.springframework.stereotype.Component;

import com.pmc.inventory.service.adapters.out.repository.mapper.CustomerEntityMapper;
import com.pmc.inventory.service.adapters.out.repository.ProductRepository;
import com.pmc.inventory.service.application.core.domain.ProductContext;
import com.pmc.inventory.service.application.ports.out.CreateProductOutputPort;

@Component
public class CreateProductOutputPortImpl implements CreateProductOutputPort {

	private final ProductRepository repository;

	private final CustomerEntityMapper mapper;

	public CreateProductOutputPortImpl(final ProductRepository repository, final CustomerEntityMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public void create(final ProductContext productContext) {
		final var customerEntity = mapper.toProductEntity(productContext);
		repository.save(customerEntity);
	}
}
