package com.noway.common.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author noway
 *   返回的基类
 */

@Data
public class BaseResponse<T> {


    private int code;

    private String msg;

    private T data;


}
