package com.cw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tata on 2017/11/12.
 */
@Controller
//@RestController
@RequestMapping("/api")
public class HelloController {

//    @RequestMapping("/say")
    @PostMapping("/say")
    public String hello(){

        return "Hello Spring Boot";

    }

    @GetMapping("/books/{id}")
    @ResponseBody
    public String getOne(){

        return "books";

    }



    @GetMapping("/getAll")
    public Object getAll(){

        Map<String, Object> map = new HashMap<>();
        map.put("name", "hello");
        map.put("age", 18);
        return map;

    }
}
