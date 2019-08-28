package com.noway.common.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author noway
 */

@Getter
@AllArgsConstructor
public enum  EnumCode {

    /**
     *
     */
    PARAM_WRONG(10000,"参数不合法"),
    NO_COURSE(10001,"没有该课程"),
    EnumCode1(10002,"参数不合法"),
    EnumCode2(10003,"参数不合法"),
    EnumCode3(10004,"参数不合法"),
    EnumCode4(10005,"参数不合法"),
    EnumCode5(10006,"参数不合法"),
    EnumCode6(10007,"参数不合法"),
    EnumCode7(10008,"参数不合法"),
    EnumCode8(10009,"参数不合法");

    private int code;
    private String msg;
}
