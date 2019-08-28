package com.noway.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author noway
 */
@ControllerAdvice
public class MyExceptionHandler {


    @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String,Object> handleException(MyException e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",e.getCode());
        map.put("message",e.getMsg());
        return map;
    }
}
