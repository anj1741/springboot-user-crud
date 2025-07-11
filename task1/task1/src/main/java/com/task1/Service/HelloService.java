package com.task1.Service;


import com.task1.Entity.Hello;
import com.task1.Repo.HelloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    @Autowired
    private HelloRepo helloRepo;

    public Hello saveHello(Hello hello) {
        return helloRepo.save(hello);
    }

    public List<Hello> getAllHello() {
        return helloRepo.findAll();
    }

    public Hello getHelloById(int id) {
        return helloRepo.findById(id).orElse(null);
    }

    public Hello updateHello(int id, Hello updated) {
        Hello existing = helloRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updated.getName());
            existing.setAge(updated.getAge());
            return helloRepo.save(existing);
        }
        return null;
    }

    public void deleteHello(int id) {
        helloRepo.deleteById(id);
    }
}