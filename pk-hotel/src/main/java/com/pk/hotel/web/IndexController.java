package com.pk.hotel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pengkai
 * @dste 2016/9/30 0030.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){

        return "/index";
    }

    @RequestMapping("/consumers")
    public String consumers(){
        return "/consumers";
    }
}
