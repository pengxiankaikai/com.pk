package com.pk.hotel.domain;

import com.pk.hotel.domain.enums.RoomStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


/**
 * Created by pengkai
 * @date 2016/10/21.
 */
@Entity
public class Rooms {

    /****基础字段****/
    @Id
    @GeneratedValue
    private Integer id;
    /*** 创建时间 ***/
    private Date createTime;
    /*** 修改时间 ***/
    private Date modifyTime;

    /** 房间号 ***/
    private String roomNo;
    /** 房间类型ID ***/
    private Integer roomTypeId;
    /** 房间状态 ***/
    private RoomStatus roomStatus;
    /** 开房时间 ***/
    private Date openTime;
    /** 退房时间 ***/
    private Date closeTime;
    /** 是否预定时长 ***/
    private boolean isReserveDuration;
    /** 预定时长DAY ***/
    private boolean ReserveDurationDAY;
    /** 预定时长HOUR ***/
    private boolean ReserveDurationHOUR;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isReserveDuration() {
        return isReserveDuration;
    }

    public void setReserveDuration(boolean reserveDuration) {
        isReserveDuration = reserveDuration;
    }

    public boolean isReserveDurationDAY() {
        return ReserveDurationDAY;
    }

    public void setReserveDurationDAY(boolean reserveDurationDAY) {
        ReserveDurationDAY = reserveDurationDAY;
    }

    public boolean isReserveDurationHOUR() {
        return ReserveDurationHOUR;
    }

    public void setReserveDurationHOUR(boolean reserveDurationHOUR) {
        ReserveDurationHOUR = reserveDurationHOUR;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", roomNo='" + roomNo + '\'' +
                ", roomTypeId=" + roomTypeId +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", isReserveDuration=" + isReserveDuration +
                ", ReserveDurationDAY=" + ReserveDurationDAY +
                ", ReserveDurationHOUR=" + ReserveDurationHOUR +
                '}';
    }
}
