package com.test;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class AnotherController {
    @GetMapping("/another")
    public String anotherUrl(){
        return "This is another url";
    }

}
