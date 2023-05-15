package hieupham.tuan02_bai01.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    /*@RequestMapping("/hello")
    public String showHello() {
        return "helloworld";
    }*/

    @RequestMapping(value = {"/", "/hello"})
    public String showHello() {
        return "helloworld";
    }

    @GetMapping("/nhapten")
    public String NhapTen() {
        return "NhapTen";
    }

    @PostMapping("/nhanten")
    public String XuatTen(HttpServletRequest request, ModelMap modelMap) {
        String ten = request.getParameter("name");
        modelMap.addAttribute("NAME", ten);
        return "XuatTen";
    }
}
