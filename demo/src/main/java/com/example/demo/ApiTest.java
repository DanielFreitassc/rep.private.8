package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class ApiTest {

    List<String> datas = new ArrayList<>();

    @Value("${username}")
    private String username;
    @Value("${os}")
    private String os;
    @Value("${processor}")
    private String processor;
    @Value("${arch}")
    private String arch;
    @GetMapping
    public String response() {
        datas.add(username);
        datas.add(os);
        datas.add(processor);
        datas.add(arch);
        return "Olá " + username + " Seu processador é um "+ arch +" tem " + processor +" núcleos, você utilizada o sistema operacional " + os;
    }


    @GetMapping("list")
    public List<String> list() {
        return datas.stream().toList();
    }
    
}
