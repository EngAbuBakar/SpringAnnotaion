package com.springannotation.springannotion.Controller;

import com.springannotation.springannotion.Service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PizzaController {
    @Autowired
    VegPizza vegPizza;
    PizzaController(VegPizza vegPizza){
        this.vegPizza=vegPizza;
    }

    public String getPizza(){
        return vegPizza.getPizza();
    }
}
