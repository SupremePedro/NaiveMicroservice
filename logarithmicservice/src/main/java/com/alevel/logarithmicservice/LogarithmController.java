package com.alevel.logarithmicservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logarithm")
public class LogarithmController {

    LogarithmService logarithmService;

    @Autowired
    public void setLogarithmService(LogarithmService logarithmService) {
        this.logarithmService = logarithmService;
    }

    @GetMapping("log")
    public ResponseEntity log(@RequestParam(name = "firstArgument") String base, @RequestParam(name = "secondArgument") String number){
        return new ResponseEntity<>(logarithmService.log(base, number), HttpStatus.OK);
    }
}
