package com.pk.hotel.web;

import com.pk.hotel.domain.RoomType;
import com.pk.hotel.service.RoomTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pengkai
 * @dste 2016/9/30 0030.
 */
@Controller
public class IndexController {

    @Resource
    private RoomTypeService roomTypeService;

    @RequestMapping(value = {"","/index"})
    public String index(Model model){
        List<RoomType> roomTypes = roomTypeService.repository().findAll();
        model.addAttribute("roomTypes", roomTypes);
        model.addAttribute("typeId", roomTypes.get(1).getId());
        return "/index";
    }

    @RequestMapping("/consumers")
    public String consumers(){
        return "/consumers";
    }
}
