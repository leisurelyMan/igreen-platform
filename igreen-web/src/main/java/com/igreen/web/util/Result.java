package com.igreen.web.util;

public class Result<T> {

    final public static Result SUCCESS = new Result(200, "success");
    final public static Result ERROR = new Result(400, "error");

    protected int code;
    protected String msg;
    protected T data;

    public Result() {
    }

    public Result(int code, String msg) {
        this(code, msg, null);
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private Result copyThis() {
        return new Result(code, msg, null);
    }

    public static Result error(String error) {
        return new Result(ERROR.code, error);
    }

    public static Result success(String error) {
        return new Result(SUCCESS.code, error);
    }

    public static Result success(Object object) {
        Result r = Result.SUCCESS.copyThis();
        r.setData(object);
        return r;
    }
}
