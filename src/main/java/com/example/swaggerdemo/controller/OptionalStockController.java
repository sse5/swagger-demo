package com.example.swaggerdemo.controller;


import com.example.swaggerdemo.bean.JsonResult;
import com.example.swaggerdemo.res.HomeFunctionRes;
import com.example.swaggerdemo.res.OptionalStockRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "app/testApi/optionalStock")
@Api(value = "OptionalStockController | 获取自选股列表接口")
public class OptionalStockController {




    @ApiOperation(value="获取自选股列表接口", notes="获取自选股接口")
    @RequestMapping(value = "getoptionalStocks/{userId}", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="userId",paramType = "query",example="123")

    })
    public ResponseEntity getoptionalStocks (Integer userId){
        JsonResult r = new JsonResult();
        List<OptionalStockRes> optionalStockResList  = new ArrayList<OptionalStockRes>();
        OptionalStockRes  stock1 = new OptionalStockRes();
        OptionalStockRes  stock2 = new OptionalStockRes();
        OptionalStockRes  stock3 = new OptionalStockRes();
        OptionalStockRes  stock4 = new OptionalStockRes();
        stock1.setCompanyCode("392379");
        stock2.setCompanyCode("327424");
        stock3.setCompanyCode("600000");
        stock4.setCompanyCode("688002");
        stock1.setCompanyAbbr("长久物流");
        stock2.setCompanyAbbr("杭发动力");
        stock3.setCompanyAbbr("浦发银行");
        stock4.setCompanyAbbr("长久物流");
        optionalStockResList.add(stock1);
        optionalStockResList.add(stock2);
        optionalStockResList.add(stock3);
        optionalStockResList.add(stock4);



        r.setResult(optionalStockResList);
        r.setStatus("ok");
        return ResponseEntity.ok(r);
    }




    /**
     * 根据id删除自选股
     * @param userId
     * @return
     */

    @ApiOperation(value="批量删除自选股", notes="删除自选股")
    @RequestMapping(value = "delete/{userId}", method = RequestMethod.DELETE)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="userId",paramType = "query",example="123"),
            @ApiImplicitParam(name="companyCode",value="公司Code",paramType = "query",example="688002，60000")

    })

    public ResponseEntity<JsonResult> deleteStocks ( Integer userId,String companyCode){
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







    @ApiOperation(value="搜索自选股列表接口", notes="搜索自选股列表接口")
    @RequestMapping(value = "getSearchStocks/{keyword}", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="keyword",value="搜索词",paramType = "query",example="上海")

    })
    public ResponseEntity getSearchStocks (String keyword){
        JsonResult r = new JsonResult();
        List<OptionalStockRes> optionalStockResList  = new ArrayList<OptionalStockRes>();
        OptionalStockRes  stock1 = new OptionalStockRes();
        OptionalStockRes  stock2 = new OptionalStockRes();
        OptionalStockRes  stock3 = new OptionalStockRes();
        OptionalStockRes  stock4 = new OptionalStockRes();
        stock1.setCompanyCode("002252");
        stock2.setCompanyCode("300039");
        stock3.setCompanyCode("300236");
        stock4.setCompanyCode("300762");
        stock1.setCompanyAbbr("上海莱士");
        stock2.setCompanyAbbr("上海凯宝");
        stock3.setCompanyAbbr("上海钢联");
        stock4.setCompanyAbbr("上海新阳");
        optionalStockResList.add(stock1);
        optionalStockResList.add(stock2);
        optionalStockResList.add(stock3);
        optionalStockResList.add(stock4);


        r.setResult(optionalStockResList);
        r.setStatus("ok");
        return ResponseEntity.ok(r);
    }






    /**
     * 根据id添加自选股
     * @param userId
     * @return
     */

    @ApiOperation(value="批量添加自选股", notes="批量添加自选股")
    @RequestMapping(value = "addStocks/{userId}", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="userId",paramType = "query",example="123"),
            @ApiImplicitParam(name="companyCode",value="公司Code",paramType = "query",example="688002，60000")

    })

    public ResponseEntity<JsonResult> addStocks ( Integer userId,String companyCode){
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
