package com.pk.hotel.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回结果封装
 * Created by pengkai
 * @date 2016/10/01
 * @mail pengxiankaikai@163.com
 */
public class RetBiz<T> {

    //返回值 SUCCESS,FAIL
    private String retCode;
    //返回信息
    private String msg;
    //返回结果集
    private List<T> results = new ArrayList<T>();
    //返回对象
    private T result;


    public RetBiz(String retCode, String msg) {
        this.retCode = retCode;
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
