package com.example.exception.controller;

import com.example.exception.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class ApiController {


   //required = false는 파라미터가 없어도 변수는 null로 떨어짐
    @GetMapping("")
    public User get(@RequestParam(required = false) String name, @RequestParam(required = false) int age){
        User user = new User();
        user.setName(name);
        user.setAge(age);

        int a = 10 + age;

        return user;
    }

    @PostMapping("")
    public User post(@RequestBody User user){
        System.out.println(user);
        return user;
    }

}
