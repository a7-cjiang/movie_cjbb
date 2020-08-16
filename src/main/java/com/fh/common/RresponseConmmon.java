package com.fh.common;

public class RresponseConmmon {

    private int code;

    private String msg;

    private Object data;


    public static RresponseConmmon success(Object data) {

        return new RresponseConmmon(200, "操作成功", data);
    }

    public static RresponseConmmon success() {

        return new RresponseConmmon(200, "操作成功");
    }


    public String getMsg() {
        return msg;
    }

    public RresponseConmmon(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public RresponseConmmon(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
