package com.fh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangp
 * @create 2020-11-19 15:49
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public String test(){
        return "success11111";
    }
}
