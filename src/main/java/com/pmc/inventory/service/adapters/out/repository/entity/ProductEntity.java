package com.pmc.inventory.service.adapters.out.repository.entity;

import java.util.StringJoiner;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
public class ProductEntity {

	@Id
	private String id;

	private String name;

	private String country;

	public ProductEntity() {
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", ProductEntity.class.getSimpleName() + "[", "]")
						.add("id='" + id + "'")
						.add("name='" + name + "'")
						.add("country='" + country + "'")
						.toString();
	}
}
