package com.spbtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String say(){

        String s="hello world !";
        //return "hello spring boot";
        return girlProperties.getCupSize();
    }

}
