package com.pmc.inventory.service.application.ports.out;

import com.pmc.inventory.service.application.core.domain.ProductContext;

public interface CreateProductOutputPort {

	void create(ProductContext productContext);
}
