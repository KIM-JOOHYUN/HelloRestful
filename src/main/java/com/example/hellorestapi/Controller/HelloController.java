package com.example.hellorestapi.Controller;

import com.example.hellorestapi.Service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Hello hello;

    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        return hello.hello(user);
    }
    @GetMapping("/helloEvery")
    public String helloEvery() {
        return "Hello Everyone!!";
    }
}
