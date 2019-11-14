package com.example.swaggerdemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.swaggerdemo.bean.KcbRecentActivityVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "/app/activity")
@Api(value = "ActivityController | 近期活动类")
public class ActivityController {
	 /**
     * 获取近期活动
     * @param size
     * @param page
     * @return
     */
	@ApiOperation(value="近期活动", notes="近期活动")
    @RequestMapping(value = "/findAllAsPage.do",method = RequestMethod.POST)
	@ApiImplicitParams({
			@ApiImplicitParam(paramType="query", name = "size", value = "每页数量", required = true, dataType = "String"),
			@ApiImplicitParam(paramType="query", name = "page", value = "页数", required = true, dataType = "String")
	})
    public Map<String, Object> selectActivityListAsPage(String size, String page) {
		Map<String, Object> result = new HashMap<String, Object>();
		Integer page1 = Integer.parseInt(page);
		Integer rows = Integer.parseInt(size);
		Integer start=(page1-1)*rows+1;
		Integer end=page1*rows;
    	String json="[{\"id\":26,\"title\":\"这是用来测试的第十一个活动\",\"startDate\":\"2019-05-30\",\"contentUrl\":\"http://10.10.11.35/jenkins\",\"contentDetails\":\"test1\",\"isValid\":\"1\"},{\"id\":21,\"title\":\"这是用来测试的第七个活动\",\"startDate\":\"2019-05-23\",\"contentUrl\":\"http://www.baidu.com\",\"contentDetails\":\"test\",\"isValid\":\"1\"}]";

    	//json转换为list
    	List<KcbRecentActivityVO> list = new ArrayList<KcbRecentActivityVO>();  
    	list = JSONObject.parseArray(json, KcbRecentActivityVO.class);
    	if (list.size()<start) {
    		result.put("rows", null);
            
		}else {
			List<KcbRecentActivityVO> list2=new ArrayList<KcbRecentActivityVO>();
			for (int i = start-1; i < end; i++) {
				list2.add(list.get(i));
			}
			result.put("rows", list2);
		}
    	result.put("total", list.size());
    	return result;
    }
}
