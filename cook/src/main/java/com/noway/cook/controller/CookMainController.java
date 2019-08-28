package com.noway.cook.controller;

import com.noway.common.entity.BaseResponse;
import com.noway.common.utils.ResultUtils;
import com.noway.cook.entry.CookMain;
import com.noway.cook.model.secondary.Banner;
import com.noway.cook.model.secondary.Option;
import com.noway.cook.repository.secondary.CookOptionRepository;
import com.noway.cook.service.CookBannerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author noway
 */

@Api("厨房主页")
@RestController
public class CookMainController {


    @Autowired
    private CookBannerService bannerService;

    @Autowired
    private CookOptionRepository optionRepository;

    @ApiOperation(value = "获取厨房首页数据")
    @GetMapping("/main")
    public BaseResponse getCookMain(){

        CookMain cookMain = new CookMain();

        List<Banner> bannerList = bannerService.findAllByEndpointAndPosition("app", "cook");


        List<Option> optionList = new ArrayList<>();
        List<Option> cookType = optionRepository.findAllByClz("cook_type");
        List<Option> monthType = optionRepository.findAllByClz("month_type");
        List<Option> functionType = optionRepository.findAllByClz("function_type");

        optionList.addAll(cookType);
        optionList.addAll(monthType);
        optionList.addAll(functionType);

        cookMain.setBanners(bannerList);
        cookMain.setOptions(optionList);
        return ResultUtils.success(cookMain);

    }
}
