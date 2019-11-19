package com.example.swaggerdemo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.swaggerdemo.bean.ReferBulletinVO;
import com.example.swaggerdemo.bean.ResultApiAppDto;
import com.example.swaggerdemo.bean.WriteBulletinVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/api/v1/app/assistant")
@Api(value = "AppAssistantController | 公告助手")
public class AppAssistantController {



    /**
     * 查询常用公告类型
     *
     * @param type
     * @return
     * @throws Exception
     */
    @ApiOperation(value="查询常用公告类型", notes="查询常用公告类型")
    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="type",value="type",paramType = "query",example="SZ")

    })
    public Object index(String type) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        ResultApiAppDto resultAppApiDto;
        String json ="{\"typeList\":[{\"typeCode\":\"0807\",\"typeDesc\":\"其他类型业绩预告\"},{\"typeCode\":\"1001\",\"typeDesc\":\"异常波动\"}]}";
        resultAppApiDto = new ResultApiAppDto(0, "成功","" ,  json);
        return json;
    }




    /**
     * 加载公告类型文件下拉选
     *
     * @param SearchText
     * @param type
     * @return
     */
    @ApiOperation(value="加载公告类型下拉选", notes="加载公告类型下拉选")
    @RequestMapping(value = "/selectmodel.do", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="type",value="类型",paramType = "query",example="SZ")

    })
    public Object selectModel(String SearchText, String type) {
        ResultApiAppDto resultAppApiDto;
        Map<String, Object> param = new HashMap<String, Object>();
        String json ="[{\n" +
                "\t\"state\": \"open\",\n" +
                "\t\"id\": \"001001\",\n" +
                "\t\"bool\": false,\n" +
                "\t\"text\": \"(001001)定期报告\",\n" +
                "\t\"text1\": \"定期报告\",\n" +
                "\t\"parentId\": null,\n" +
                "\t\"children\": [{\n" +
                "\t\t\"state\": \"open\",\n" +
                "\t\t\"id\": \"001001001\",\n" +
                "\t\t\"bool\": false,\n" +
                "\t\t\"text\": \"(001001001)定期报告（中文）\",\n" +
                "\t\t\"text1\": \"定期报告（中文）\",\n" +
                "\t\t\"parentId\": \"001001\",\n" +
                "\t\t\"children\": [{\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001001001\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001001001)年度报告\",\n" +
                "\t\t\t\"text1\": \"年度报告\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [{\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001001001\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001001001)年度报告全文\",\n" +
                "\t\t\t\t\"text1\": \"年度报告全文\",\n" +
                "\t\t\t\t\"parentId\": \"001001001001\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001001002\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001001002)年度报告摘要\",\n" +
                "\t\t\t\t\"text1\": \"年度报告摘要\",\n" +
                "\t\t\t\t\"parentId\": \"001001001001\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001001003\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001001003)年度报告补充公告\",\n" +
                "\t\t\t\t\"text1\": \"年度报告补充公告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001001\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001001004\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001001004)年度报告更正公告\",\n" +
                "\t\t\t\t\"text1\": \"年度报告更正公告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001001\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001001005\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001001005)年度财务报告\",\n" +
                "\t\t\t\t\"text1\": \"年度财务报告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001001\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001001002\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001001002)半年度报告\",\n" +
                "\t\t\t\"text1\": \"半年度报告\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [{\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001002001\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001002001)半年度报告全文\",\n" +
                "\t\t\t\t\"text1\": \"半年度报告全文\",\n" +
                "\t\t\t\t\"parentId\": \"001001001002\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001002002\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001002002)半年度报告摘要\",\n" +
                "\t\t\t\t\"text1\": \"半年度报告摘要\",\n" +
                "\t\t\t\t\"parentId\": \"001001001002\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001002003\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001002003)半年报补充公告\",\n" +
                "\t\t\t\t\"text1\": \"半年报补充公告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001002\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001002004\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001002004)半年报更正公告\",\n" +
                "\t\t\t\t\"text1\": \"半年报更正公告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001002\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001002005\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001002005)半年度财务报告\",\n" +
                "\t\t\t\t\"text1\": \"半年度财务报告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001002\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001001003\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001001003)一季度报告\",\n" +
                "\t\t\t\"text1\": \"一季度报告\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [{\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001003001\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001003001)一季度报告全文\",\n" +
                "\t\t\t\t\"text1\": \"一季度报告全文\",\n" +
                "\t\t\t\t\"parentId\": \"001001001003\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001003002\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001003002)一季度报告正文\",\n" +
                "\t\t\t\t\"text1\": \"一季度报告正文\",\n" +
                "\t\t\t\t\"parentId\": \"001001001003\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001003003\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001003003)一季度报告补充公告\",\n" +
                "\t\t\t\t\"text1\": \"一季度报告补充公告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001003\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001003004\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001003004)一季度报告更正公告\",\n" +
                "\t\t\t\t\"text1\": \"一季度报告更正公告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001003\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001003005\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001003005)一季度财务报告\",\n" +
                "\t\t\t\t\"text1\": \"一季度财务报告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001003\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001001004\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001001004)三季度报告\",\n" +
                "\t\t\t\"text1\": \"三季度报告\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [{\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001004001\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001004001)三季度报告全文\",\n" +
                "\t\t\t\t\"text1\": \"三季度报告全文\",\n" +
                "\t\t\t\t\"parentId\": \"001001001004\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001004002\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001004002)三季度报告正文\",\n" +
                "\t\t\t\t\"text1\": \"三季度报告正文\",\n" +
                "\t\t\t\t\"parentId\": \"001001001004\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001004003\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001004003)三季度报告补充公告\",\n" +
                "\t\t\t\t\"text1\": \"三季度报告补充公告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001004\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001004004\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001004004)三季度报告更正公告\",\n" +
                "\t\t\t\t\"text1\": \"三季度报告更正公告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001004\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001004005\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001004005)三季度财务报告\",\n" +
                "\t\t\t\t\"text1\": \"三季度财务报告\",\n" +
                "\t\t\t\t\"parentId\": \"001001001004\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001001005\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001001005)财务报告\",\n" +
                "\t\t\t\"text1\": \"财务报告\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [{\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001005001\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001005001)财务报告全文\",\n" +
                "\t\t\t\t\"text1\": \"财务报告全文\",\n" +
                "\t\t\t\t\"parentId\": \"001001001005\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001001005002\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001001005002)财务报告补充更正\",\n" +
                "\t\t\t\t\"text1\": \"财务报告补充更正\",\n" +
                "\t\t\t\t\"parentId\": \"001001001005\",\n" +
                "\t\t\t\t\"children\": [{\n" +
                "\t\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\t\"id\": \"001001001005002001\",\n" +
                "\t\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\t\"text\": \"(001001001005002001)财务报告补充更正\",\n" +
                "\t\t\t\t\t\"text1\": \"财务报告补充更正\",\n" +
                "\t\t\t\t\t\"parentId\": \"001001001005002\",\n" +
                "\t\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t\t}],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001002002\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001002002)年度报告（英文）\",\n" +
                "\t\t\t\"text1\": \"年度报告（英文）\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [{\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001002002001\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001002002001)年度报告全文（英文）\",\n" +
                "\t\t\t\t\"text1\": \"年度报告全文（英文）\",\n" +
                "\t\t\t\t\"parentId\": \"001001002002\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001002003\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001002003)半年度报告（英文）\",\n" +
                "\t\t\t\"text1\": \"半年度报告（英文）\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [{\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001002003001\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001002003001)半年度报告全文（英文）\",\n" +
                "\t\t\t\t\"text1\": \"半年度报告全文（英文）\",\n" +
                "\t\t\t\t\"parentId\": \"001001002003\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}, {\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001002003002\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001002003002)半年度报告摘要（英文）\",\n" +
                "\t\t\t\t\"text1\": \"半年度报告摘要（英文）\",\n" +
                "\t\t\t\t\"parentId\": \"001001002003\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001002004\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001002004)一季度报告（英文）\",\n" +
                "\t\t\t\"text1\": \"一季度报告（英文）\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\"id\": \"001001002005\",\n" +
                "\t\t\t\"bool\": false,\n" +
                "\t\t\t\"text\": \"(001001002005)三季度报告（英文）\",\n" +
                "\t\t\t\"text1\": \"三季度报告（英文）\",\n" +
                "\t\t\t\"parentId\": \"001001001\",\n" +
                "\t\t\t\"children\": [{\n" +
                "\t\t\t\t\"state\": \"open\",\n" +
                "\t\t\t\t\"id\": \"001001002005001\",\n" +
                "\t\t\t\t\"bool\": false,\n" +
                "\t\t\t\t\"text\": \"(001001002005001)三季度报告全文（英文）\",\n" +
                "\t\t\t\t\"text1\": \"三季度报告全文（英文）\",\n" +
                "\t\t\t\t\"parentId\": \"001001002005\",\n" +
                "\t\t\t\t\"children\": [],\n" +
                "\t\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\t\"type\": \"SZ\"\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"isValid\": \"1\",\n" +
                "\t\t\t\"isParent\": \"1\",\n" +
                "\t\t\t\"type\": \"SZ\"\n" +
                "\t\t}],\n" +
                "\t\t\"isValid\": \"1\",\n" +
                "\t\t\"isParent\": \"1\",\n" +
                "\t\t\"type\": \"SZ\"\n" +
                "\t}],\n" +
                "\t\"isValid\": \"1\",\n" +
                "\t\"isParent\": \"1\",\n" +
                "\t\"type\": \"SZ\"\n" +
                "}]";
        resultAppApiDto = new ResultApiAppDto(0, "成功","" ,  json);
        return resultAppApiDto;
    }

    /**
     * 公告助手列表查询
     *
     * @param
     * @param
     * @return
     */
    @ApiOperation(value="公告列表", notes="公告列表")
    @RequestMapping(value = "/referBulletin.do", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="type",value="类型",paramType = "query",example="SZ"),
            @ApiImplicitParam(name="size",value="多少条",paramType = "query",example="20"),
            @ApiImplicitParam(name="currentPage",value="第几页",paramType = "query",example="1"),
            @ApiImplicitParam(name="typeCode",value="公告类型",paramType = "query",example=""),
            @ApiImplicitParam(name="companyCodeFilter",value="公司代码",paramType = "query",example="680002"),
            @ApiImplicitParam(name="typeDesc",value="关键字",paramType = "query",example="680002"),




    })
    public Object referBulletin(String size,String currentPage, String companyCodeFilter, String typeCode,
                                String typeDesc, String type, String BulleninType) {
        Map<String,Object> result = new HashMap<String,Object>();
        List<ReferBulletinVO> list = new ArrayList<ReferBulletinVO>();
        ResultApiAppDto resultAppApiDto;
        ReferBulletinVO vo = new ReferBulletinVO();
        vo.setBulletin_id("123123");
        vo.setBulletin_title("标题一");
        vo.setBulletin_title_keyword("nihao");
        vo.setBulletin_type("1");
        vo.setColl("123123");
        vo.setCompany_code("680002");
        vo.setDisclose_date(new Date());
        vo.setFile_num(1);
        vo.setFocus_num(2);
        vo.setTemp_id("2222");
        vo.setType_code("222");
        vo.setType_desc("4444");
        vo.setUrl("www.baidu.com");
        list.add(vo);


        ReferBulletinVO vo1 = new ReferBulletinVO();
        vo1.setBulletin_id("123123");
        vo1.setBulletin_title("标题二");
        vo1.setBulletin_title_keyword("nihao");
        vo1.setBulletin_type("1");
        vo1.setColl("123123");
        vo1.setCompany_code("680002");
        vo1.setDisclose_date(new Date());
        vo1.setFile_num(1);
        vo1.setFocus_num(2);
        vo1.setTemp_id("2222");
        vo1.setType_code("222");
        vo1.setType_desc("4444");
        vo1.setUrl("www.baidu.com");
        list.add(vo1);

        long t = 111111;
        WriteBulletinVO a = new WriteBulletinVO();
        a.setId(t);
        a.setParentTypeCode("000");
        a.setParentTypeDesc("你好");
        a.setTempName("文件一");
        a.setTempFilePath("xxx/temp/id");
        a.setTypeCode("234");
        a.setTypeDesc("hhhh");

        result.put("industry", list);
        result.put("typeVo", a);
        result.put("typeCode", typeCode);
        result.put("type", type);
        result.put("companyCodeFilter", companyCodeFilter);
        result.put("typeDesc", typeDesc);
        result.put("total", 10);
        resultAppApiDto = new ResultApiAppDto(0, "成功","" ,  result);
        return resultAppApiDto;
    }


}
