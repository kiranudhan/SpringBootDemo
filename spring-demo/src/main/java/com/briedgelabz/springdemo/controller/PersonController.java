package com.briedgelabz.springdemo.controller;

import com.briedgelabz.springdemo.entity.Person;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/person")
public class PersonController {


    //http://localhost:8082/person/getName
     @GetMapping("/getName")
    public String getName(){
        return "kiran";
    }

    //http://localhost:8082/person/addPerson
//   data in json format ->  {
//               "name":"kiran",
//               "no":101
//            }
    @PostMapping("/addPerson")
    public String addPerson(@RequestBody Person person){
         return "name : " + person.getName() + " " + person.getNo();
    }

    //http://localhost:8082/person/update/101
    @PutMapping("/update/{no}")
    public String updateName(@PathVariable Integer no,@RequestParam(value = "name") String name){
         return "details : " + no + " " + name ;
    }

}
