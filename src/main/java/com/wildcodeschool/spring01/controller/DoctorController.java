package com.wildcodeschool.spring01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody  // transforme les objets en JSON
    public String index1() {
        //return "Greetings from Spring Boot!";
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody  // transforme les objets en JSON
    public String index2() {
        //return "Greetings from Spring Boot!";
        return "David Tennant";
    }

     @GetMapping("/doctor/13")
    @ResponseBody  // transforme les objets en JSON
    public String index3() {
        //return "Greetings from Spring Boot!";
        return "Jodie Whittaker";
    }
}