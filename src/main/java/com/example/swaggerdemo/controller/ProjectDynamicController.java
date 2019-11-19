package com.example.swaggerdemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.swaggerdemo.bean.ProjectVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * desc : 项目动态相关
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/api/v1/project")
@Api(value = "ProjectDynamicController | 项目动态接口类")
public class ProjectDynamicController {

	private static final Logger log = LoggerFactory.getLogger(ProjectDynamicController.class);

	

	@ApiOperation(value="项目动态接口", notes="项目动态接口")
	@RequestMapping(value="/getCompanyCounts")
	@ResponseBody
	public Object getCompanyCounts() {
		List<ProjectVO> list = new ArrayList<ProjectVO>();
		ProjectVO p1 = new ProjectVO();
		p1.setNum(12);
		p1.setStatus("1");
		ProjectVO p2 = new ProjectVO();
		p2.setNum(14);
		p1.setStatus("2");
		ProjectVO p3 = new ProjectVO();
		p3.setNum(56);
		p3.setStatus("3-1");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("returnCode","999999");
		map.put("returnMsg","处理成功");
		map.put("pageNum",1);
		map.put("pageSize",20);
		map.put("size",19);
		map.put("total",19);
		map.put("list",list);
		map.put("hasNextPage","false");
		map.put("nextPage",0);
		map.put("toolsType",null);
		map.put("issued_number",7);
		return map;
	}



}
