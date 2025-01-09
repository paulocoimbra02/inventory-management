package com.pmc.inventory.service.application.core.usecase;

import org.springframework.stereotype.Component;

import com.pmc.inventory.service.application.core.domain.ProductContext;
import com.pmc.inventory.service.application.ports.in.CreateProductInputPort;
import com.pmc.inventory.service.application.ports.out.CreateProductOutputPort;

@Component
public class CreateProductUseCase implements CreateProductInputPort {

	private final CreateProductOutputPort port;

	public CreateProductUseCase(final CreateProductOutputPort port) {
		this.port = port;
	}

	@Override
	public void create(final ProductContext productContext) {
		port.create(productContext);
	}
}
