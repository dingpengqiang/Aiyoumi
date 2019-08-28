package com.noway.cook.controller;


import com.noway.common.entity.BaseResponse;
import com.noway.common.enums.EnumCode;
import com.noway.common.exception.MyException;
import com.noway.common.utils.ResultUtils;
import com.noway.cook.model.primary.Cook;
import com.noway.cook.service.CookListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author noway
 */
@Api("厨房列表")
@RestController
public class CookListController {


    @Autowired
    private CookListService cookListService;

//    @ApiImplicitParam(name = "type",value = "来源",required = true,dataType = "String")

    @ApiOperation(value = "获取厨房列表", notes = "根据type、key和category获取")
    @GetMapping("/list")
    public BaseResponse getCookList(
            @ApiParam(name = "type", value = "来源", required = true) String type,
            @ApiParam(name = "key", value = "请求主键", required = true) String key,
            @ApiParam(name = "category", value = "请求类别", required = true) String category) {


        if (type == null || key == null || category == null) {
            throw new MyException(EnumCode.PARAM_WRONG);
        }
        List<Cook> cookList = new ArrayList<>();
        if ("cook_type".equals(category)) {
            cookList = cookListService.findAllByCookTypeContainsAndType(key, type);
        } else if ("month_type".equals(category)) {
            cookList = cookListService.findAllByMonthTypeContainsAndType(key, type);
        } else if ("function_type".equals(category)) {
            cookList = cookListService.findAllByFunctionTypeContainsAndType(key, type);
        }
        return ResultUtils.success(cookList);
    }
}
