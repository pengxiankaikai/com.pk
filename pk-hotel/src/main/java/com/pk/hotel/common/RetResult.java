package com.pk.hotel.common;

/**
 * 返回结果定义
 * Created by pengkai
 * @date 2016/9/29 0029.
 */
public interface RetResult {

    String SUCCESS = "SUCCESS";
    String FAIL = "FAIL";

    String MSG_SUCCESS = "操作成功";
    String MSG_FAIL = "操作失败";
    String MSG_PARAM_ERROR = "参数错误";
    String MSG_NOT_FOUND_RECORD = "该记录不存在";
}
