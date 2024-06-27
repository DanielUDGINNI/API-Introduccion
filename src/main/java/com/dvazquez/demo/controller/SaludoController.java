package com.dvazquez.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayhi")
public class SaludoController {

    @GetMapping("/hi")
    public String helloworld(){
        return "Hello World";
    }
    @GetMapping("/data/{nombre}/{edad}")
    public String helloworldName(@PathVariable String nombre, @PathVariable int edad){
        return "hello world " + nombre + " " + edad;
    }
}
