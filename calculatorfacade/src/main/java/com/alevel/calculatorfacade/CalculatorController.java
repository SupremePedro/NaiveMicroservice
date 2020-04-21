package com.alevel.calculatorfacade;


import com.alevel.calculatorfacade.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/evaluate")
public class CalculatorController {

    CalculatorService calculatorService;

    @Autowired
    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(value = "/plus")
    public ResponseEntity plus(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument){
        final String uri = "http://localhost:8081/arithmetic/plus?firstArgument="+firstArgument+"&secondArgument="+secondArgument;
        return new ResponseEntity<>(new RestTemplate().getForObject(uri, String.class), HttpStatus.OK);
    }

    @GetMapping(value = "/minus")
    public ResponseEntity minus(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument){
        final String uri = "http://localhost:8081/arithmetic/minus?firstArgument="+firstArgument+"&secondArgument="+secondArgument;
        return new ResponseEntity<>(new RestTemplate().getForObject(uri, String.class), HttpStatus.OK);
    }

    @GetMapping(value = "/multiply")
    public ResponseEntity multiply(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument){
        final String uri = "http://localhost:8081/arithmetic/multiply?firstArgument="+firstArgument+"&secondArgument="+secondArgument;
        return new ResponseEntity<>(new RestTemplate().getForObject(uri, String.class), HttpStatus.OK);
    }

    @GetMapping(value = "/divide")
    public ResponseEntity divide(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument){
        final String uri = "http://localhost:8081/arithmetic/divide?firstArgument="+firstArgument+"&secondArgument="+secondArgument;
        return new ResponseEntity<>(new RestTemplate().getForObject(uri, String.class), HttpStatus.OK);
    }

    @GetMapping(value = "/log")
    public ResponseEntity log(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument){
        final String uri = "http://localhost:8083/logarithm/log?firstArgument="+firstArgument+"&secondArgument="+secondArgument;
        return new ResponseEntity<>(new RestTemplate().getForObject(uri, String.class), HttpStatus.OK);
    }

    @GetMapping(value = "/sin")
    public ResponseEntity sin(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument){
        final String uri = "http://localhost:8082/trigonometry/sin?firstArgument="+firstArgument+"&secondArgument="+secondArgument;
        return new ResponseEntity<>(new RestTemplate().getForObject(uri, String.class), HttpStatus.OK);
    }
    @GetMapping(value = "/cos")
    public ResponseEntity cos(@RequestParam(name = "firstArgument") String firstArgument, @RequestParam(name = "secondArgument") String secondArgument){
        final String uri = "http://localhost:8082/trigonometry/cos?firstArgument="+firstArgument+"&secondArgument="+secondArgument;
        return new ResponseEntity<>(new RestTemplate().getForObject(uri, String.class), HttpStatus.OK);
    }
}
