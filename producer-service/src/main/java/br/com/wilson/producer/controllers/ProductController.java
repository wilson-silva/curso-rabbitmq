package br.com.wilson.producer.controllers;

import br.com.wilson.producer.services.ProductService;
import dtos.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> produceProduct(@RequestBody ProductDTO productDTO){
        productService.createProduct(productDTO);
        return ResponseEntity.status(CREATED).build();
    }
}
