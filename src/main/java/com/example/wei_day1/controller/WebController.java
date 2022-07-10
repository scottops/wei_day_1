package com.example.wei_day1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/zkt")
public class WebController {

    @RequestMapping("/play")
    public String play(){
        return "play";
    }

    @RequestMapping("/doPlay")
    public String doPlay( String url){
        return "redirect:https://jx.blbo.cc:4433/?url="+url;
    }

}
