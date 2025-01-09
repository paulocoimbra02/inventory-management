package com.pmc.inventory.service.adapters.in.controllers.dto;

import java.util.StringJoiner;

public class ProductRequest {

    private String name;

    public ProductRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ProductRequest.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
