package com.site.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FController {
    @GetMapping("/index")
    public String index() {
        return "index";  // JSP 파일명만 반환
    }
}
