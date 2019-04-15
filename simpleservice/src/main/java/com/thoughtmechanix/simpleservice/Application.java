package com.thoughtmechanix.simpleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
@RequestMapping(value="hello")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @RequestMapping(value="/{firstName}/{lastName}",method = RequestMethod.GET)
//    public String hello( @PathVariable("firstName") String firstName,
//                         @PathVariable("lastName") String lastName) {
//
//        return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
//    }
    @RequestMapping(value = "/{kkm}/{ddm}",method = RequestMethod.GET)
    public String say(@PathVariable("kkm")Integer kkm,@PathVariable("ddm") String ddm){
        return String.format("{\"message\":\"Hello %s %s\"}", kkm, ddm);
    }
}
