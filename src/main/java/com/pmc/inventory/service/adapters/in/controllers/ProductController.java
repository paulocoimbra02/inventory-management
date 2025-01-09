package com.pmc.inventory.service.adapters.in.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pmc.inventory.service.adapters.in.controllers.dto.ProductRequest;
import com.pmc.inventory.service.adapters.in.controllers.mapper.ProductContextMapper;
import com.pmc.inventory.service.application.ports.in.CreateProductInputPort;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/api/v1/products")
public class ProductController {

    private final CreateProductInputPort createProductInputPort;
    private final ProductContextMapper productContextMapper;

    public ProductController(
            final CreateProductInputPort createProductInputPort,
            final ProductContextMapper productContextMapper) {
        this.createProductInputPort = createProductInputPort;
        this.productContextMapper = productContextMapper;
    }

    @PostMapping
    public ResponseEntity<Void> createProduct(
            @RequestBody @Valid final ProductRequest body,
            @RequestHeader final String country,
            @RequestHeader final String traceId) {
        final var productContext = productContextMapper.toProductContext(body, country);
        createProductInputPort.create(productContext);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
