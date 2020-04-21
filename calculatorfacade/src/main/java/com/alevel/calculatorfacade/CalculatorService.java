package com.alevel.calculatorfacade;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Double plus(String firstArg, String secondArg){
        Double a = Double.parseDouble(firstArg);
        Double b = Double.parseDouble(secondArg);
        return a + b;
    }
}
