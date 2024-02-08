package com.example.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Productcontroller {
     @GetMapping 
     // ResponseEntity e o igual a response no note 
     public ResponseEntity getAllProduct(){
          return ResponseEntity.ok("deu ok");
     }
}
