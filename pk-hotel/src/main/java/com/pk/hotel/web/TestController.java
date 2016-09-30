package com.pk.hotel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/30 0030.
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("host", "www.baicu.com");
        return "index";
    }
}
