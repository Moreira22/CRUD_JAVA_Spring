package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRepository;
import com.example.crud.domain.product.RequestProduct;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class Productcontroller {
     @Autowired
     private ProductRepository repository;

     // ResponseEntity e o igual a response no note 
     @GetMapping 
     public ResponseEntity getAllProduct(){
          var allProduct = repository.findAll();
          return ResponseEntity.ok(allProduct);
     }
     @PostMapping
     public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
          Product newProduct = new Product(data);
          System.out.println(data);
          repository.save(newProduct);
          return ResponseEntity.ok().build();
     }

}
