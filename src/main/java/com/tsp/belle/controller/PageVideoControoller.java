package com.tsp.belle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageVideoControoller {

    @RequestMapping("video/index")
    public String index(){
        return "video/index";
    }
}
