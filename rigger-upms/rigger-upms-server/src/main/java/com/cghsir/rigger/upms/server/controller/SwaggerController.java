package com.cghsir.rigger.upms.server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * spring boot 集成 swagger测试controller
 * Created by cghsir on 2017/7/13.
 */
@Controller
@RequestMapping("/swagger")
@Api(value = "swagger", description = "spring boot 集成swagger测试")
public class SwaggerController {

    private final static Logger _log = LoggerFactory.getLogger(SwaggerController.class);

    @ApiOperation(value = "测试testSwagger")
    @RequestMapping(value = "/testSwagger/{msg}", method = RequestMethod.GET)
    @ResponseBody
    public String testSwagger(@PathVariable String msg) {
        _log.info("info:" + msg);
        _log.error("error:" + msg);
        return msg;
    }

    @ApiOperation(value = "跳转到首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String toIndex() {
        return "index";
    }
}
