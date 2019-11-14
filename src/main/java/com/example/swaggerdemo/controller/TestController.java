package com.example.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
@Api(value = "TestController | 测试接口类")
public class TestController {
    /**
     * 根据ID查询用户
     * @param test_value_1
     * @return
     */
    @ApiOperation(value="测试接口1", notes="测试接口1")
    @ApiImplicitParam(name = "test", value = "test_value_1", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "user/{test_value_1}", method = RequestMethod.GET)
    public ResponseEntity<Integer> test1 (@PathVariable(value = "test_value_1") Integer test_value_1){
        return ResponseEntity.ok(test_value_1);
    }

}
