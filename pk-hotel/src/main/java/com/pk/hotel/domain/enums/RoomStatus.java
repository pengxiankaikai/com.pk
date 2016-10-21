package com.pk.hotel.domain.enums;

/**
 * Created by pengkai
 * @date 2016/10/21.
 */
public enum RoomStatus {

    OPEN("开房中"),
    CLOSE("关闭中"),
    SWEEP("清扫中");

    private String val;

    RoomStatus(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
