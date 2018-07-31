package com.yzsj.sedemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String defualt(){
        return "/index"; //当浏览器输入/，会返回 /templates/home.html页面
    }
    @GetMapping("/index")
    public String index(){
        return "/index"; //当浏览器输入/index时，会返回 /templates/home.html页面
    }
}
