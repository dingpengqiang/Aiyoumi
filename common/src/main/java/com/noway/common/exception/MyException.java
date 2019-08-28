package com.noway.common.exception;


import com.noway.common.enums.EnumCode;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author noway
 */
@Data
@AllArgsConstructor
public class MyException extends RuntimeException {

    private int code;

    private String msg;

    public MyException(EnumCode enumCode){
        code = enumCode.getCode();
        msg = enumCode.getMsg();
    }

}
