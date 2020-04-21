package com.alevel.arithmeticservice;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    public Double plus(String firstArg, String secondArg){
        Double a= Double.parseDouble(firstArg);
        Double b = Double.parseDouble(secondArg);
        return a + b;
    }

    public Double minus(String firstArg, String secondArg){
        Double a= Double.parseDouble(firstArg);
        Double b = Double.parseDouble(secondArg);
        return a - b;
    }

    public Double multiply(String firstArg, String secondArg){
        Double a= Double.parseDouble(firstArg);
        Double b = Double.parseDouble(secondArg);
        return a * b;
    }

    public Double divide(String firstArg, String secondArg){
        Double a= Double.parseDouble(firstArg);
        Double b = Double.parseDouble(secondArg);
        return a / b;
    }
}
