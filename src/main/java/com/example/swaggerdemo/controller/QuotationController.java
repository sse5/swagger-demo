package com.example.swaggerdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.swaggerdemo.bean.QuotationVO;
import com.example.swaggerdemo.bean.ResultApiAppDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


/**
 * desc : 行情数据
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/api/v1/quotation")
@Api(value = "QuotationController | 行情数据接口类")
public class QuotationController {
	
	@ApiOperation(value="快照行情接口", notes="快照行情接口")
	@RequestMapping(value="/initData")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType="query", name = "companycode", value = "证券(股票)代码", required = true, dataType = "String"),
		@ApiImplicitParam(paramType="query", name = "tradeMarket", value = "市场", required = true, dataType = "String")
	})
	@ResponseBody
	public Object initQuotation(String companycode,String tradeMarket){
		
		ResultApiAppDto resultApiAppDto;									//返回模板
		
		QuotationVO q = new QuotationVO();				
		q.setA_volume(121.775);
		q.setAmplitude("0.56%");
		q.setChange(-0.05);
		q.setChg_rate("-0.56%");
		q.setCurFlowEquity(51330.0000);
		q.setHigh(8.86);
		q.setLast(8.8);
		q.setLow(8.62);
		q.setOpen(8.79);
		q.setPe7("11.09");
		q.setPlz_value("-1.18%");
		q.setPrev_close(8.86);
		q.setTotalshar("72937.9440");
		q.setTuanrate("0.24%");
		resultApiAppDto = new ResultApiAppDto(0,"成功","",q);
		return resultApiAppDto;
		
	}
	
	
	
	
	
}
