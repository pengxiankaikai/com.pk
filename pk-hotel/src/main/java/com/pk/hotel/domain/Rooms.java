package com.pk.hotel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by pengkai
 * @date 2016/10/20 0020.
 */
@Entity
public class RoomS {

    @Id
    @GeneratedValue
    private Integer id;
    /** 房间类型id ***/
    private Integer roomTypeId;
    /** 房间号 ***/
    private String roomNo;
    /** 是否打开 ***/
    private boolean isOpen;
    /** 是否打开预定时长 ***/
    private boolean isOpenReserve;
    /** 预定时间（day） ***/
    private Double reserveDay;
    /** 预定时间（hour） ***/
    private Timestamp reserveHour;
    /** 创建时间 ***/
    private Timestamp createtime;
    /** 修改时间 ***/
    private Timestamp modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isOpenReserve() {
        return isOpenReserve;
    }

    public void setOpenReserve(boolean openReserve) {
        isOpenReserve = openReserve;
    }

    public Double getReserveDay() {
        return reserveDay;
    }

    public void setReserveDay(Double reserveDay) {
        this.reserveDay = reserveDay;
    }

    public Timestamp getReserveHour() {
        return reserveHour;
    }

    public void setReserveHour(Timestamp reserveHour) {
        this.reserveHour = reserveHour;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getModifytime() {
        return modifytime;
    }

    public void setModifytime(Timestamp modifytime) {
        this.modifytime = modifytime;
    }
}
