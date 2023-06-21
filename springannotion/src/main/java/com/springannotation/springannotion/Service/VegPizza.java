package com.springannotation.springannotion.Service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class VegPizza {
    public String getPizza()
    {
        return "This is a fresh vegetable Pizza! ";
    }
}
