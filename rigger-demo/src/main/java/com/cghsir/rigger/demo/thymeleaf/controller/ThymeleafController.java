package com.cghsir.rigger.demo.thymeleaf.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cghsir on 2017/7/13.
 */
@Controller
@RequestMapping("/thymeleaf")
@Api(value = "thymeleaf示例")
public class ThymeleafController {

    @ApiOperation(value = "跳转到thymeleaf首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("msg", "hello thymeleaf!!!!");
        return "index";
    }
}
