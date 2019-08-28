package com.noway.cook.controller;


import com.noway.common.entity.BaseResponse;
import com.noway.common.enums.EnumCode;
import com.noway.common.exception.MyException;
import com.noway.common.utils.ResultUtils;
import com.noway.cook.model.primary.Cook;
import com.noway.cook.service.CookDetailService;
import com.noway.cook.service.CookListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author noway
 */
@Api("厨房详情")
@RestController
public class CookDetailController {


    @Autowired
    private CookDetailService cookDetailService;


    @ApiOperation(value = "获取厨房详情", notes = "根据ID获取厨房详情")
    @ApiImplicitParam(name = "id", value = "主键ID")
    @GetMapping("/detail")
    public BaseResponse getCookDetail(Long id) {
        if (id == null) {
            throw new MyException(EnumCode.PARAM_WRONG);
        }
        Cook cook;
        try {
            cook = cookDetailService.findById(id).get();
        } catch (Exception e) {
            throw new MyException(EnumCode.NO_COURSE);
        }
        cookDetailService.updateRead(cook.getRead() + 1, cook.getId());
        return ResultUtils.success(cook);
    }


    @ApiOperation(value = "点赞")
    @GetMapping("/like/add")
    public BaseResponse getAddLike(Long id) {

        Cook cook;
        try {
            cook = cookDetailService.findById(id).get();
        } catch (Exception e) {
            throw new MyException(EnumCode.NO_COURSE);
        }
        cookDetailService.updateLike(cook.getLike() + 1, cook.getId());

        return ResultUtils.success();
    }

    @ApiOperation(value = "取消点赞")
    @GetMapping("/like/cancel")
    public BaseResponse getCancelLike(Long id) {

        Cook cook;
        try {
            cook = cookDetailService.findById(id).get();
        } catch (Exception e) {
            throw new MyException(EnumCode.NO_COURSE);
        }
        Integer like = cook.getLike();
        if (like > 0) {
            like -= 1;
        } else {
            like = 0;
        }
        cookDetailService.updateLike(like, cook.getId());
        return ResultUtils.success();
    }

    @ApiOperation(value = "收藏")
    @GetMapping("/collect/add")
    public BaseResponse getAddCollect(Long id) {

        Cook cook;
        try {
            cook = cookDetailService.findById(id).get();
        } catch (Exception e) {
            throw new MyException(EnumCode.NO_COURSE);
        }
        cookDetailService.updateCollect(cook.getMark() + 1, cook.getId());
        return ResultUtils.success();
    }

    @ApiOperation(value = "取消收藏")
    @GetMapping("/collect/cancel")
    public BaseResponse getCancelCollect(Long id) {

        Cook cook;
        try {
            cook = cookDetailService.findById(id).get();
        } catch (Exception e) {
            throw new MyException(EnumCode.NO_COURSE);
        }
        Integer mark = cook.getMark();
        if (mark > 0) {
            mark -= 1;
        } else {
            mark = 0;
        }
        cookDetailService.updateCollect(mark, cook.getId());
        return ResultUtils.success();
    }
}
