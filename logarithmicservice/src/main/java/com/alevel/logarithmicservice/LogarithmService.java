package com.alevel.logarithmicservice;


import org.springframework.stereotype.Service;

@Service
public class LogarithmService {

    public Double log(String base, String number){
        Double a = Double.parseDouble(number);
        Double b = Double.parseDouble(base);
        return Math.log(a)/Math.log(b);
    }
}
