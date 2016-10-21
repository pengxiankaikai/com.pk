package com.pk.hotel.service;

import com.pk.hotel.common.RetBiz;
import com.pk.hotel.domain.RoomType;
import com.pk.hotel.repository.RoomTypeRepository;

/**
 * Created by pengkai
 * @date 2016/10/21.
 */
public interface RoomTypeService {

    RoomTypeRepository repository();

    RetBiz saveOrUpdate(RoomType roomType);
}
