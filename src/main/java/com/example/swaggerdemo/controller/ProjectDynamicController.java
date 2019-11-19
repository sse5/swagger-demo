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
		p2.setStatus("2");
		ProjectVO p3 = new ProjectVO();
		p3.setNum(56);
		p3.setStatus("6");
		ProjectVO p4 = new ProjectVO();
		p4.setNum(16);
		p4.setStatus("5");
		ProjectVO p5 = new ProjectVO();
		p5.setNum(23);
		p5.setStatus("4");
		ProjectVO p6 = new ProjectVO();
		p6.setNum(21);
		p6.setStatus("8");
		ProjectVO p7 = new ProjectVO();
		p7.setNum(20);
		p7.setStatus("2");
		ProjectVO p8 = new ProjectVO();
		p8.setNum(9);
		p8.setStatus("3");
		ProjectVO p9 = new ProjectVO();
		p9.setNum(46);
		p9.setStatus("7");
		ProjectVO p10 = new ProjectVO();
		p10.setNum(46);
		p10.setStatus("9");
		ProjectVO p11 = new ProjectVO();
		p11.setNum(46);
		p11.setStatus("10");
		ProjectVO p12 = new ProjectVO();
		p12.setNum(46);
		p12.setStatus("9-5");
		ProjectVO p13 = new ProjectVO();
		p13.setNum(46);
		p13.setStatus("3-6");
		ProjectVO p14= new ProjectVO();
		p14.setNum(46);
		p14.setStatus("3-");
		ProjectVO p15 = new ProjectVO();
		p15.setNum(46);
		p15.setStatus("3-1");
		ProjectVO p16 = new ProjectVO();
		p16.setNum(46);
		p16.setStatus("3-3");
		ProjectVO p17 = new ProjectVO();
		p17.setNum(46);
		p17.setStatus("9-4");
		ProjectVO p18 = new ProjectVO();
		p18.setNum(46);
		p18.setStatus("5-2");
		ProjectVO p19 = new ProjectVO();
		p19.setNum(46);
		p19.setStatus("5-3");
		
		
		
		
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
		list.add(p11);
		list.add(p12);
		list.add(p13);
		list.add(p14);
		list.add(p15);
		list.add(p16);
		list.add(p17);
		list.add(p18);
		list.add(p19);
		
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
