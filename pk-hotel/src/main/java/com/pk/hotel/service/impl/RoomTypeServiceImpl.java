package com.pk.hotel.service.impl;

import com.pk.hotel.common.RetBiz;
import com.pk.hotel.common.RetResult;
import com.pk.hotel.domain.RoomType;
import com.pk.hotel.repository.RoomTypeRepository;
import com.pk.hotel.service.RoomTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pengkai
 * @date 2016/10/21.
 */
@Service
public class RoomTypeServiceImpl implements RoomTypeService{

    @Resource
    private RoomTypeRepository roomTypeRepository;

    @Override
    public RoomTypeRepository repository() {
        return roomTypeRepository;
    }

    @Override
    public RetBiz saveOrUpdate(RoomType roomType) {
        if (null == roomType)
            return new RetBiz(RetResult.FAIL, RetResult.MSG_PARAM_ERROR);
        if (null == roomType.getId()){
            roomTypeRepository.save(roomType);
            return new RetBiz(RetResult.SUCCESS);
        }else {
            RoomType r = roomTypeRepository.findOne(roomType.getId());
            if (null == r)
                return new RetBiz(RetResult.FAIL, RetResult.MSG_NOT_FOUND_RECORD);
            roomTypeRepository.save(r);
            return new RetBiz(RetResult.SUCCESS);
        }
    }
}
