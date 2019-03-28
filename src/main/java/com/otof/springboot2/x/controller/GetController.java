package com.otof.springboot2.x.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("get_method")
public class GetController {

    @GetMapping(path = "mode_1/{name}/{age}")
    public Map getUrlPathParam(@PathVariable("name") String name, @PathVariable String age) {
        return new HashMap(){{
            put("name", name);
            put("age", age);
        }};
    }

    @GetMapping("mode_2")
    public Map getQueryParam(@RequestParam(value = "name") String name, @RequestParam(defaultValue = "100") String age) {
        return new HashMap(){{
            put("name", name);
            put("age", age);
        }};
    }
}
