package com.cghsir.rigger.upms.server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring boot 集成 swagger测试controller
 * Created by cghsir on 2017/7/13.
 */
@RestController
@RequestMapping("/swagger")
@Api(value = "swagger", description = "spring boot 集成swagger测试")
public class SwaggerController {

    @ApiOperation(value = "测试testSwagger")
    @RequestMapping(value = "/testSwagger/{msg}", method = RequestMethod.GET)
    public String testSwagger(@PathVariable String msg) {
        return msg;
    }
}
