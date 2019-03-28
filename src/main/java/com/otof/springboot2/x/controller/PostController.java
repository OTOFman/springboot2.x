package com.otof.springboot2.x.controller;

import com.otof.springboot2.x.entity.PostRequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post_method")
public class PostController {

    @PostMapping(value = "post_request_body")
    public String handlePostRequest(@RequestBody PostRequestParam param) {
        return "My name is " + param.getName() + "and I am " + " years old!";
    }
}
