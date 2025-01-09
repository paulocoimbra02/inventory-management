package com.pmc.inventory.service.application.ports.in;

import com.pmc.inventory.service.application.core.domain.ProductContext;

public interface CreateProductInputPort {

	void create(ProductContext productContext);

}
