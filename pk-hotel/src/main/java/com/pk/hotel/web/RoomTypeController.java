package com.pk.hotel.web;

import com.pk.hotel.common.RetBiz;
import com.pk.hotel.common.RetResult;
import com.pk.hotel.domain.RoomType;
import com.pk.hotel.service.RoomTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by pengkai
 * @date 2016/10/21.
 */
@Controller
@RequestMapping("/roomtype")
public class RoomTypeController {

    @Resource
    private RoomTypeService roomTypeService;

    @RequestMapping("/add")
    @ResponseBody
    public RetBiz add(/*@RequestParam RoomType roomType*/){
        RoomType roomType = new RoomType();
        roomType.setName("单人间");
        roomType.setPrice(100.0);
        roomType.setCreateTime(new Date());
        roomTypeService.saveOrUpdate(roomType);
        return new RetBiz(RetResult.SUCCESS);
    }
}
