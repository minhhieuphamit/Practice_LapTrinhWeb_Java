package hieupham.tuan02_bai02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/")
    public String show(){
        return "layouts/main-layout";
    }

    @RequestMapping("/home")
    public String showHome(){
        return "home";
    }

    @RequestMapping("/contact")
    public String showContact(){
        return "contact";
    }

    @RequestMapping("/product")
    public String showProduct(){
        return "product";
    }
}
