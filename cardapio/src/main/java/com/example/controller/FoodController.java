package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// para mostra que este e um controller
@RequestMapping("food")// rota Web

public class FoodController {

    @GetMapping  // para mostra qual sera o metodo executado
    public void getAll(){
        
    }


}
