package com.alevel.arithmeticservice;

import com.alevel.arithmeticservice.ArithmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("arithmetic")

public class ArithmeticController {


    ArithmeticService arithmeticService;

    @Autowired
    public void setArithmeticService(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("plus")
    public ResponseEntity plus(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument) {
        return new ResponseEntity<>(arithmeticService.plus(firstArgument, secondArgument), HttpStatus.OK);
    }

    @GetMapping("minus")
    public ResponseEntity minus(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument) {
        return new ResponseEntity<>(arithmeticService.minus(firstArgument, secondArgument), HttpStatus.OK);
    }

    @GetMapping("multiply")
    public ResponseEntity multiply(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument) {
        return new ResponseEntity<>(arithmeticService.multiply(firstArgument, secondArgument), HttpStatus.OK);
    }

    @GetMapping("divide")
    public ResponseEntity divide(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument) {
        return new ResponseEntity<>(arithmeticService.divide(firstArgument, secondArgument), HttpStatus.OK);
    }


}
