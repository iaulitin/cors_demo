package com.example.democorsfront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("view1")
    public String view1() {
        return "view1";
    }

    @GetMapping("view2")
    public String view2() {
        return "view2";
    }

    @GetMapping("view3")
    public String view3() {
        return "view3";
    }
}
