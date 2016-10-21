package com.pk.hotel.repository;

import com.pk.hotel.domain.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by pengkai
 * @date 2016/10/21.
 */
public interface RoomTypeRepository extends JpaRepository<RoomType, Integer>, JpaSpecificationExecutor<RoomType>{

}
