package com.noway.common.utils;

import com.noway.common.entity.BaseResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author noway
 */
@Slf4j
public class ResultUtils {


    public static BaseResponse success(Object o){
        BaseResponse<Object> result = new BaseResponse<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(o);
        return result;
    }

    public static BaseResponse success(){
        return success(null);
    }

    public static BaseResponse error(Integer code,String msg){
        BaseResponse<Object> result = new BaseResponse<>();
        result.setCode(code);
        result.setMsg(msg);
        log.debug(code+"----------------------------"+msg);
        return result;
    }
}
