package com.briedgelabz.springdemo.controller;

import com.briedgelabz.springdemo.entity.Person;
import com.briedgelabz.springdemo.entity.User;
import org.springframework.web.bind.annotation.*;

//url=localhost:8082/greeting
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/greeting")
    public String greeting(){

        return "hello";
    }

    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){

        return "Hello from BriedgeLabz";
    }
    //http://localhost:8082/hello/query?name=kiran
    @RequestMapping(value = {"/query"}, method= RequestMethod.GET)
    public String sayHello(@RequestParam(value = "") String name){

        return "Hello " + name + "!";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to java";
    }

    //http://localhost:8082/hello/post
//    {
//        "firstName":"kiran",
//        "lastName":"udhan"
//    }
    @PostMapping("/post")
    public String sayHelloToUser(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }
    //http://localhost:8082/hello/put/Kiran?lastName=Udhan
    @PutMapping("/put/{firstName}")
    public String putRequest(@PathVariable String firstName,@RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + "!";
    }

    //http://localhost:8082/hello?name=kiran
    @GetMapping
    public String demoRequestParam(@RequestParam String fName,String lName){
        return "Hello " + fName + " " + lName;
    }

    @GetMapping("/variable/{fName}")
    public String demoPathVariable(@PathVariable String fName){
        return "Hello " + fName;
    }


}
