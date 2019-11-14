package com.example.swaggerdemo.controller;


import com.example.swaggerdemo.bean.JsonResult;
import com.example.swaggerdemo.bean.ResultDto;
import com.example.swaggerdemo.bean.User;
import com.example.swaggerdemo.res.HomeFunctionRes;
import com.example.swaggerdemo.res.HomeTypeRes;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "app/testApi/home")
@Api(value = "HomeController | 首页接口类")
public class HomeController {


    @ApiOperation(value="首页功能分类", notes="首页功能接口")
    @RequestMapping(value = "getHomeType", method = RequestMethod.GET)
    public ResponseEntity getHomeType (){


        JsonResult r = new JsonResult();



        List<HomeTypeRes> homeTypeList = new ArrayList<HomeTypeRes>();


        HomeTypeRes typeRes1 = new HomeTypeRes();
        HomeTypeRes typeRes2 = new HomeTypeRes();
        HomeTypeRes typeRes3 = new HomeTypeRes();
        typeRes1.setTypeName("互动");
        typeRes2.setTypeName("活动");
        typeRes3.setTypeName("数据");
        typeRes1.setTypeOrder("1");
        typeRes2.setTypeOrder("2");
        typeRes3.setTypeOrder("3");



        List<HomeFunctionRes> homeFunctionResList1 = new ArrayList<HomeFunctionRes>();
        HomeFunctionRes  homeFunctionRes1 = new HomeFunctionRes();
        HomeFunctionRes  homeFunctionRes2 = new HomeFunctionRes();
        HomeFunctionRes  homeFunctionRes3 = new HomeFunctionRes();
        homeFunctionRes1.setFunctionName("问答板");
        homeFunctionRes2.setFunctionName("e互动问答");
        homeFunctionRes3.setFunctionName("找人");
        homeFunctionRes1.setFunctionOrder("1");
        homeFunctionRes2.setFunctionOrder("2");
        homeFunctionRes3.setFunctionOrder("3");
        homeFunctionRes1.setId(1);
        homeFunctionRes2.setId(2);
        homeFunctionRes3.setId(3);
        homeFunctionResList1.add(homeFunctionRes1);
        homeFunctionResList1.add(homeFunctionRes2);
        homeFunctionResList1.add(homeFunctionRes3);


        typeRes1.setHomeFunctionResList(homeFunctionResList1);


        List<HomeFunctionRes> homeFunctionResList2 = new ArrayList<HomeFunctionRes>();
        HomeFunctionRes  homeFunctionRes4 = new HomeFunctionRes();
        HomeFunctionRes  homeFunctionRes5 = new HomeFunctionRes();
        HomeFunctionRes  homeFunctionRes6 = new HomeFunctionRes();
        homeFunctionRes4.setFunctionName("培训");
        homeFunctionRes5.setFunctionName("说明会申请");
        homeFunctionRes6.setFunctionName("其他活动");
        homeFunctionRes4.setFunctionOrder("1");
        homeFunctionRes5.setFunctionOrder("2");
        homeFunctionRes6.setFunctionOrder("3");
        homeFunctionRes4.setId(4);
        homeFunctionRes5.setId(5);
        homeFunctionRes6.setId(6);
        homeFunctionResList2.add(homeFunctionRes4);
        homeFunctionResList2.add(homeFunctionRes5);
        homeFunctionResList2.add(homeFunctionRes6);

        typeRes2.setHomeFunctionResList(homeFunctionResList2);



        List<HomeFunctionRes> homeFunctionResList3 = new ArrayList<HomeFunctionRes>();
        HomeFunctionRes  homeFunctionRes7 = new HomeFunctionRes();
        HomeFunctionRes  homeFunctionRes8 = new HomeFunctionRes();
        HomeFunctionRes  homeFunctionRes9 = new HomeFunctionRes();
        homeFunctionRes7.setFunctionName("媒体案例");
        homeFunctionRes8.setFunctionName("舆情");
        homeFunctionRes9.setFunctionName("法律法规");
        homeFunctionRes7.setFunctionOrder("1");
        homeFunctionRes8.setFunctionOrder("2");
        homeFunctionRes9.setFunctionOrder("3");
        homeFunctionRes7.setId(7);
        homeFunctionRes8.setId(8);
        homeFunctionRes9.setId(9);
        homeFunctionResList3.add(homeFunctionRes7);
        homeFunctionResList3.add(homeFunctionRes8);
        homeFunctionResList3.add(homeFunctionRes9);
        typeRes3.setHomeFunctionResList(homeFunctionResList3);
        homeTypeList.add(typeRes3);
        homeTypeList.add(typeRes2);
        homeTypeList.add(typeRes1);


        r.setResult(homeTypeList);
        r.setStatus("ok");

        return ResponseEntity.ok(r);
    }











    @ApiOperation(value="获取用户常用功能接口", notes="根据用户id来获取用户常用功能接口")
    @RequestMapping(value = "getCommonFunctions/{id}", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="id",paramType = "query",example="123")

    })
    public ResponseEntity getCommonFunctions (Integer userId){
        JsonResult r = new JsonResult();
        List<HomeFunctionRes>  homeFunctionResList = new ArrayList<HomeFunctionRes>();
        HomeFunctionRes homeFunctionRes1 = new HomeFunctionRes();
        HomeFunctionRes homeFunctionRes2 = new HomeFunctionRes();
        HomeFunctionRes homeFunctionRes3 = new HomeFunctionRes();


        homeFunctionRes1.setId(1);
        homeFunctionRes2.setId(3);
        homeFunctionRes3.setId(3);

        homeFunctionRes1.setFunctionName("IR统计");
        homeFunctionRes2.setFunctionName("e活动回答");
        homeFunctionRes3.setFunctionName("会议管理");


        homeFunctionResList.add(homeFunctionRes1);
        homeFunctionResList.add(homeFunctionRes2);
        homeFunctionResList.add(homeFunctionRes3);

        r.setResult(homeFunctionResList);
        r.setStatus("ok");

        return ResponseEntity.ok(r);

    }




    /**
     * 根据用户id修改用户信息
     * @param
     * @return
     */
    @ApiOperation(value="更新用户首页信息", notes="根据用户id更新首页功能")
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update (@ApiParam(name="userId",value="用户id",required = true) Integer userId, @ApiParam(name="functionIds",value="共能id（以，隔开）",required = true) String functionIds){
        JsonResult r = new JsonResult();
        try {
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }












}
