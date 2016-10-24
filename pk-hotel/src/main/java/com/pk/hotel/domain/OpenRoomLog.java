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
public class OpenRoomLog {

    /****基础字段****/
    @Id
    @GeneratedValue
    private Integer id;
    /*** 创建时间 ***/
    private Date createTime;
    /*** 修改时间 ***/
    private Date modifyTime;

    /** 消费者名称 ***/
    private String consumerName;
    /** 消费者性别 ***/
    private boolean consumerSex;
    /** 消费者身份证号 ***/
    private String consumerID;
    /** 消费者人数 ***/
    private Integer consumerCount;
    /** 开房时间 ***/
    private Date openTime;
    /** 退房时间 ***/
    private Date closeTime;
    /** 消费金额 ***/
    private Double consumeMoney;
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

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public boolean isConsumerSex() {
        return consumerSex;
    }

    public void setConsumerSex(boolean consumerSex) {
        this.consumerSex = consumerSex;
    }

    public String getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(String consumerID) {
        this.consumerID = consumerID;
    }

    public Integer getConsumerCount() {
        return consumerCount;
    }

    public void setConsumerCount(Integer consumerCount) {
        this.consumerCount = consumerCount;
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

    public Double getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(Double consumeMoney) {
        this.consumeMoney = consumeMoney;
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
        return "ConsumerOpenLog{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", consumerName='" + consumerName + '\'' +
                ", consumerSex=" + consumerSex +
                ", consumerID='" + consumerID + '\'' +
                ", consumerCount=" + consumerCount +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", consumeMoney=" + consumeMoney +
                ", isReserveDuration=" + isReserveDuration +
                ", ReserveDurationDAY=" + ReserveDurationDAY +
                ", ReserveDurationHOUR=" + ReserveDurationHOUR +
                '}';
    }
}
