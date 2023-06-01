package com.codestates.practicegithubActiondeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/test")
    public String test(){
        return "hello myoungin!";
    }

    @GetMapping("/test2")
    public String test2(){
        return "hello myjo!";
    }
}
