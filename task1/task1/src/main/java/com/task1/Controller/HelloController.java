package com.task1.Controller;


import com.task1.Entity.Hello;
import com.task1.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @PostMapping
    public Hello createHello(@RequestBody Hello hello) {
        return helloService.saveHello(hello);
    }

    @GetMapping
    public List<Hello> getAllHello() {
        return helloService.getAllHello();
    }

    @GetMapping("/{id}")
    public Hello getHelloById(@PathVariable int id) {
        return helloService.getHelloById(id);
    }

    @PutMapping("/{id}")
    public Hello updateHello(@PathVariable int id, @RequestBody Hello hello) {
        return helloService.updateHello(id, hello);
    }

    @DeleteMapping("/{id}")
    public void deleteHello(@PathVariable int id) {
        helloService.deleteHello(id);
    }
}