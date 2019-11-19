package com.example.swaggerdemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.swaggerdemo.bean.Biztype;
import com.example.swaggerdemo.bean.LawVO;
import com.example.swaggerdemo.bean.ResultApiAppDto;
import com.example.swaggerdemo.bean.ResultDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;






@Controller
@RequestMapping(value = "/api/v1/laws")
@Api(value = "LawsController | 法律法规接口类")
public class LawsController {
	
	
	
	@ApiOperation(value="法律法规初始化数据、按标题查询法律法规数据接口", notes="法律法规初始化数据、按标题查询法律法规数据接口")
	@RequestMapping(value = "/allLaws")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "String"),
		@ApiImplicitParam(paramType="query", name = "fileName", value = "文件标题关键字", required = true, dataType = "String")
	})
	@ResponseBody
	public Object allLaws(HttpServletRequest requ) {
		Map<String,Object> result = new HashMap<String,Object>();				//结果容器
		Map<String,Object> param = new HashMap<String,Object>();				//参数容器
		
		ResultApiAppDto resultApiAppDto;										//返回模板
		//参数
		String userId = requ.getParameter("userId").trim();						//用户ID
		String fileName = requ.getParameter("fileName").trim();					//文件名

		
		if(userId == "" || userId == null) {
			result.put("result","");
			resultApiAppDto = new ResultApiAppDto(-1,"失败","",result);
			return resultApiAppDto;
		}else {
			
			LawVO L1 = new LawVO();
			LawVO L2 = new LawVO();
			
			
			L1.setId(1);
			L1.setIsFavorite("1");
			L1.setHierarchyId("19");
			L1.setHierarchyDesc("业务通知（与公告）");
			L1.setFileUrl("http://www.gov.cn/zhengce/2019-02/14/content_5365818.htm");
			L1.setFilePath("/projects/data/lcinfo/upload/legal_rule/上海证券交易所上市开放式基金业务指引（2019年修订）.docx");
			L1.setFileName("关于《期货交易管理条例》第七十条第一款第五项的规定（征求意见稿）");
			L1.setBiztypeDesc("董监高");
			L1.setIsTop("0");
			L1.setUpdateTime("2019-04-17 00:00:00.0");
			L1.setUploadDept("中华人民共和国国家税务总局");
			
			L2.setId(2);
			L2.setIsFavorite("0");
			L2.setHierarchyId("19");
			L2.setHierarchyDesc("业务通知（与公告）");
			L2.setFileUrl("http://www.gov.cn/zhengce/2019-02/14/content_5365818.htm");
			L2.setFilePath("/projects/data/lcinfo/upload/legal_rule/上海证券交易所上市开放式基金业务指引（2019年修订）.docx");
			L2.setFileName("关于《期货交易管理条例》第七十条第一款第五项的规定（征求意见稿）");
			L2.setBiztypeDesc("董监高");
			L2.setIsTop("0");
			L2.setUpdateTime("2019-04-17 00:00:00.0");
			L2.setUploadDept("中华人民共和国国家税务总局");
			List<LawVO> list = new ArrayList<LawVO>();
			list.add(L1);
			list.add(L2);
			result.put("result",list);
			resultApiAppDto = new ResultApiAppDto(0,"成功","",result);
			return resultApiAppDto;
		}	
	}
	
	
	
	
	@ApiOperation(value="按业务查询法律法规数据接口", notes="按业务查询法律法规数据接口")
	@RequestMapping(value = "/baseBiztypeID")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "String"),
		@ApiImplicitParam(paramType="query", name = "bizTypeId", value = "业务ID", required = true, dataType = "String")
	})
	@ResponseBody
	public Object baseBiztypeID(HttpServletRequest requ) {
		Map<String,Object> result = new HashMap<String,Object>();				//结果容器
		Map<String,Object> param = new HashMap<String,Object>();				//参数容器
		ResultApiAppDto resultApiAppDto;										//返回模板
		//参数
		String userId = requ.getParameter("userId").trim();						//用户ID
		String bizTypeId = requ.getParameter("bizTypeId").trim();				//业务Id	
		if(userId == "" || userId == null) {
			result.put("result","");
			resultApiAppDto = new ResultApiAppDto(-1,"失败","",result);
			return resultApiAppDto;
		}else {
			LawVO L1 = new LawVO();
			LawVO L2 = new LawVO();
			
			
			L1.setId(1);
			L1.setIsFavorite("1");
			L1.setHierarchyId("19");
			L1.setHierarchyDesc("业务通知（与公告）");
			L1.setFileUrl("http://www.gov.cn/zhengce/2019-02/14/content_5365818.htm");
			L1.setFilePath("/projects/data/lcinfo/upload/legal_rule/上海证券交易所上市开放式基金业务指引（2019年修订）.docx");
			L1.setFileName("关于《期货交易管理条例》第七十条第一款第五项的规定（征求意见稿）");
			L1.setBiztypeDesc("董监高");
			L1.setIsTop("0");
			L1.setUpdateTime("2019-04-17 00:00:00.0");
			L1.setUploadDept("中华人民共和国国家税务总局");
			
			L2.setId(2);
			L2.setIsFavorite("0");
			L2.setHierarchyId("19");
			L2.setHierarchyDesc("业务通知（与公告）");
			L2.setFileUrl("http://www.gov.cn/zhengce/2019-02/14/content_5365818.htm");
			L2.setFilePath("/projects/data/lcinfo/upload/legal_rule/上海证券交易所上市开放式基金业务指引（2019年修订）.docx");
			L2.setFileName("关于《期货交易管理条例》第七十条第一款第五项的规定（征求意见稿）");
			L2.setBiztypeDesc("董监高");
			L2.setIsTop("0");
			L2.setUpdateTime("2019-04-17 00:00:00.0");
			L2.setUploadDept("中华人民共和国国家税务总局");
			List<LawVO> list = new ArrayList<LawVO>();
			list.add(L1);
			list.add(L2);
			result.put("result",list);
			resultApiAppDto = new ResultApiAppDto(0,"成功","",result);
			return resultApiAppDto;
		}	
	}
	
	
	
	
	
	@ApiOperation(value="用户收藏的法律法规数据接口", notes="用户收藏的法律法规数据接口")
	@RequestMapping(value="/baseUser")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "String"),
		@ApiImplicitParam(paramType="query", name = "isFavorite", value = "用户收藏标识", required = true, dataType = "String")
	})
	@ResponseBody
	public Object baseUser(HttpServletRequest requ) {
		Map<String,Object> result = new HashMap<String,Object>();				//结果容器
		Map<String,Object> param = new HashMap<String,Object>();				//参数容器
		ResultApiAppDto resultApiAppDto;										//返回模板
		//参数
		String userId = requ.getParameter("userId").trim();						//用户ID
		String isFavorite = requ.getParameter("isFavorite").trim();				//用户收藏
		if(userId == "" || userId == null) {
			result.put("result","");
			resultApiAppDto = new ResultApiAppDto(-1,"失败","",result);
			return resultApiAppDto;
		}else {
			LawVO L1 = new LawVO();
			LawVO L2 = new LawVO();
			
			
			L1.setId(1);
			L1.setIsFavorite("1");
			L1.setHierarchyId("19");
			L1.setHierarchyDesc("业务通知（与公告）");
			L1.setFileUrl("http://www.gov.cn/zhengce/2019-02/14/content_5365818.htm");
			L1.setFilePath("/projects/data/lcinfo/upload/legal_rule/上海证券交易所上市开放式基金业务指引（2019年修订）.docx");
			L1.setFileName("关于《期货交易管理条例》第七十条第一款第五项的规定（征求意见稿）");
			L1.setBiztypeDesc("董监高");
			L1.setIsTop("0");
			L1.setUpdateTime("2019-04-17 00:00:00.0");
			L1.setUploadDept("中华人民共和国国家税务总局");
			
			L2.setId(2);
			L2.setIsFavorite("1");
			L2.setHierarchyId("19");
			L2.setHierarchyDesc("业务通知（与公告）");
			L2.setFileUrl("http://www.gov.cn/zhengce/2019-02/14/content_5365818.htm");
			L2.setFilePath("/projects/data/lcinfo/upload/legal_rule/上海证券交易所上市开放式基金业务指引（2019年修订）.docx");
			L2.setFileName("关于《期货交易管理条例》第七十条第一款第五项的规定（征求意见稿）");
			L2.setBiztypeDesc("董监高");
			L2.setIsTop("0");
			L2.setUpdateTime("2019-04-17 00:00:00.0");
			L2.setUploadDept("中华人民共和国国家税务总局");
			List<LawVO> list = new ArrayList<LawVO>();
			list.add(L1);
			list.add(L2);
			result.put("result",list);
			resultApiAppDto = new ResultApiAppDto(0,"成功","",result);
			return resultApiAppDto;
		}	
	}
	
	

	
	
	
	
	@ApiOperation(value="法律法规所有业务接口", notes="法律法规所有业务接口")
	@RequestMapping(value="/biztypes")
	@ResponseBody
	public Object biztypes(HttpServletRequest requ) {
		Map<String,Object> map = new HashMap<String,Object>();					//结果容器
		ResultApiAppDto resultApiAppDto;										//返回模板
		
		Biztype b1 = new Biztype();
		Biztype b2 = new Biztype();
		Biztype b3 = new Biztype();
		b1.setId(1);
		b1.setBiztypeName("董监高");
		b2.setId(2);
		b2.setBiztypeName("公司治理");
		b3.setId(3);
		b3.setBiztypeName("三会管理");
		
		
		
		List<Biztype> list = new ArrayList<Biztype>();
		list.add(b1);
		list.add(b2);
		list.add(b3);

		map.put("result", list);
		resultApiAppDto = new ResultApiAppDto(0,"成功","",map);
		return resultApiAppDto;
	}
	
	
	
	
	@ApiOperation(value="查询业务接口", notes="查询业务接口")
	@RequestMapping("/lawsBiztype")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType="query", name = "businessName", value = "业务名称关键字", required = true, dataType = "String")
	})
	@ResponseBody
	public Object lawsBiztype(HttpServletRequest requ) {
		String businessName = requ.getParameter("businessName").trim();		//业务名称
		Map<String,Object> map = new HashMap<String,Object>();				//结果容器
		ResultApiAppDto resultApiAppDto;									//返回模板
		
		if(businessName == "" || businessName==null) {
			map.put("result","");
			resultApiAppDto = new ResultApiAppDto(-1,"失败","",map);
			return resultApiAppDto;
		}else {
			Biztype b1 = new Biztype();
			b1.setId(1);
			b1.setBiztypeName("董监高");
			
			List<Biztype> list = new ArrayList<Biztype>();
			list.add(b1);
			
			map.put("result", list);
			resultApiAppDto = new ResultApiAppDto(0,"成功","",map);
			return resultApiAppDto;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
