package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRepository;
import com.example.crud.domain.product.RequestProduct;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class Productcontroller {
     @Autowired
     private ProductRepository repository;

     // ResponseEntity e o igual a response no note 
     @GetMapping 
     public ResponseEntity getAllProduct(){
          var allProduct = repository.findAllByActiveTrue();
          return ResponseEntity.ok(allProduct);
     }

     @PostMapping
     public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
          Product newProduct = new Product(data);
          System.out.println(data);
          repository.save(newProduct);
          return ResponseEntity.ok().build();
     }

     @PutMapping()
     @Transactional
     public ResponseEntity updateProduct( @RequestBody @Valid RequestProduct data){
          java.util.Optional<Product> optionalProduct  = repository.findById(data.id());
          if (optionalProduct.isPresent()) {
               Product product = optionalProduct.get();
               product.setName(data.name());
               product.setPrice_in_cents(data.price_in_cents());
               return ResponseEntity.ok(product);
          } else{
               throw new EntityNotFoundException();
          }
     }
     
     @DeleteMapping("/{id}")
     @Transactional
     public ResponseEntity deleteProduct(@PathVariable String id){
          java.util.Optional<Product> optionalProduct  = repository.findById(id);
          if(optionalProduct.isPresent()){
               Product product = optionalProduct.get();
               product.setActive(false);
               return ResponseEntity.noContent().build();
          } else {
               throw new EntityNotFoundException();
          }
     }

}
