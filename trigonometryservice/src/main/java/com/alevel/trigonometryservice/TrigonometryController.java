package com.alevel.trigonometryservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trigonometry")
public class TrigonometryController {

    TrigonometryService trigonometryService;

    @Autowired
    public void setTrigonometryService(TrigonometryService trigonometryService) {
        this.trigonometryService = trigonometryService;
    }

    @GetMapping("sin")
    public ResponseEntity sin(@RequestParam(name = "firstArgument") String firstArgument){
        return  new ResponseEntity<>(trigonometryService.sin(firstArgument), HttpStatus.OK);
    }

    @GetMapping("cos")
    public ResponseEntity cos(@RequestParam(name = "firstArgument") String firstArgument){
        return  new ResponseEntity<>(trigonometryService.cos(firstArgument), HttpStatus.OK);
    }
}
