package com.pmc.inventory.service.application.core.domain;

import java.util.StringJoiner;

public class Product {
	private String name;

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
						.add("name='" + name + "'")
						.toString();
	}
}
