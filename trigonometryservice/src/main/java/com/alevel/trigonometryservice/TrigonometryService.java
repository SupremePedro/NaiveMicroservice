package com.alevel.trigonometryservice;


import org.springframework.stereotype.Service;

@Service
public class TrigonometryService {

    public Double sin(String argument){
        Double a = Double.parseDouble(argument);
        return Math.sin(a);
    }

    public Double cos(String argument){
        Double a = Double.parseDouble(argument);
        return Math.cos(a);
    }
}
