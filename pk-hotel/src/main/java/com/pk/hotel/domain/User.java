package com.pk.hotel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by pengkai
 * @date 2016/10/21.
 */
@Entity
public class User {

    /****基础字段****/
    @Id
    @GeneratedValue
    private Integer id;
    /*** 创建时间 ***/
    private Date createTime;
    /*** 修改时间 ***/
    private Date modifyTime;

    /** 用户名 ***/
    private String username;
    /** 密码 ***/
    private String password;
    /** 电话 ***/
    private String tel;
    /** 邮箱 ***/
    private String email;
    /** 身份证 ***/
    private String idCard;
    /** 酒店名 ***/
    private String hotelName;
    /** 房间数量 ***/
    private Integer roomCount;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", roomCount=" + roomCount +
                '}';
    }
}
