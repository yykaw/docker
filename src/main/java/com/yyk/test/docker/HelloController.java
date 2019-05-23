package com.yyk.test.docker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(String  msg ){
        String docker =  "centO3333s22222227 测试 docker :"+  msg;
        return docker;
    }
}
