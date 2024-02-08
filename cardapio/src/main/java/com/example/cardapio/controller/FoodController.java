package com.example.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // setando como controller 
@RequestMapping("food") // rota web 

public class FoodController {

    @GetMapping // inticar o aonte sera cetado 
    public void getAll(){
        
    }


}
