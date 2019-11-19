package com.example.swaggerdemo.controller;


import com.example.swaggerdemo.bean.PaginationVO;
import com.example.swaggerdemo.bean.ReferBulletinVO;
import com.example.swaggerdemo.bean.WriteBulletinVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
        String json ="{\"typeList\":[{\"typeCode\":\"0807\",\"typeDesc\":\"其他类型业绩预告\"},{\"typeCode\":\"1001\",\"typeDesc\":\"异常波动\"}]}";
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

        Map<String, Object> param = new HashMap<String, Object>();
        String json ="[{\"state\":\"closed\",\"id\":\"01\",\"bool\":false,\"text\":\"(01)定期报告\",\"text1\":\"定期报告\",\"parentId\":\"01\",\"children\":[{\"state\":null,\"id\":\"0101\",\"bool\":false,\"text\":\"(0101)年报\",\"text1\":\"年报\",\"parentId\":\"01\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0102\",\"bool\":false,\"text\":\"(0102)一季报\",\"text1\":\"一季报\",\"parentId\":\"01\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0103\",\"bool\":false,\"text\":\"(0103)半年报\",\"text1\":\"半年报\",\"parentId\":\"01\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0104\",\"bool\":false,\"text\":\"(0104)三季报\",\"text1\":\"三季报\",\"parentId\":\"01\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null}],\"isValid\":null,\"isParent\":\"1\",\"type\":null},{\"state\":\"closed\",\"id\":\"02\",\"bool\":false,\"text\":\"(02)董事会和监事会\",\"text1\":\"董事会和监事会\",\"parentId\":\"02\",\"children\":[{\"state\":null,\"id\":\"0201\",\"bool\":false,\"text\":\"(0201)董事会决议\",\"text1\":\"董事会决议\",\"parentId\":\"02\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0202\",\"bool\":false,\"text\":\"(0202)监事会决议\",\"text1\":\"监事会决议\",\"parentId\":\"02\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0203\",\"bool\":false,\"text\":\"(0203)推选职工董事或者监事\",\"text1\":\"推选职工董事或者监事\",\"parentId\":\"02\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0204\",\"bool\":false,\"text\":\"(0204)董事会审议变更证券简称\",\"text1\":\"董事会审议变更证券简称\",\"parentId\":\"02\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null}],\"isValid\":null,\"isParent\":\"1\",\"type\":null},{\"state\":\"closed\",\"id\":\"03\",\"bool\":false,\"text\":\"(03)股东大会\",\"text1\":\"股东大会\",\"parentId\":\"03\",\"children\":[{\"state\":null,\"id\":\"0301\",\"bool\":false,\"text\":\"(0301)股东大会召开通知\",\"text1\":\"股东大会召开通知\",\"parentId\":\"03\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0302\",\"bool\":false,\"text\":\"(0302)股东大会相关提示\",\"text1\":\"股东大会相关提示\",\"parentId\":\"03\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0303\",\"bool\":false,\"text\":\"(0303)股东大会延期\",\"text1\":\"股东大会延期\",\"parentId\":\"03\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null},{\"state\":null,\"id\":\"0305\",\"bool\":false,\"text\":\"(0305)股东大会取消\",\"text1\":\"股东大会取消\",\"parentId\":\"03\",\"children\":[],\"isValid\":null,\"isParent\":null,\"type\":null}]";
        return json;
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
    public Object referBulletin(PaginationVO page, String companyCodeFilter, String typeCode,
                                String typeDesc, String type, String BulleninType) {
        Map<String,Object> result = new HashMap<String,Object>();
        List<ReferBulletinVO> list = new ArrayList<ReferBulletinVO>();

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
        result.put("total", page.getTotalItems());

        return result;
    }


}
