package com.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@Api(tags = "Welcome API", description = "Welcome api description")
public class WelcomeController {

    @GetMapping("/welcome")
    @ApiOperation("Welcome message")
    public String welcome(){
        return "Welcome to swagger application";
    }

    @GetMapping("/welcome/{name}")
    @ApiOperation("Welcome message with name")
    public String welcome(@ApiParam(name = "name", value = "Name to display with welcome message", example = "Jyoti")
                              @PathVariable String name){
        return "Welcome "+name+" to swagger application";
    }
}
