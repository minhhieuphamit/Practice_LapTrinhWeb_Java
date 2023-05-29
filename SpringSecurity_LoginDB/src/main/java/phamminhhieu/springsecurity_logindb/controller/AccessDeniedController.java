package phamminhhieu.springsecurity_logindb.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AccessDeniedController {
    @GetMapping("/403")
    public String getAccessDenied() {
        return "403";
    }
}
