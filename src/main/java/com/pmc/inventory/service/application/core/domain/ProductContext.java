package com.pmc.inventory.service.application.core.domain;

import java.util.StringJoiner;

public class ProductContext {

	private String country;

	private Product product;

	public ProductContext() {
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(final Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", ProductContext.class.getSimpleName() + "[", "]")
						.add("country='" + country + "'")
						.add("product=" + product)
						.toString();
	}
}
