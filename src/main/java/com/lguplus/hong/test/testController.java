package com.lguplus.hong.test;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class testController {


    @GetMapping()
    public String test() {
        return "get mapping success";
    }

    @PostMapping("/{value}")
    public String test(@PathVariable String value) {
        String input = value;
        return "post mapping success : value=" + input;
    }

}
