package com.example.swaggerdemo.bean;

import io.swagger.annotations.ApiModelProperty;

public class ProjectVO {
	@ApiModelProperty(value = "公司数")
	private int num;										//公司数
	@ApiModelProperty(value = "状态")
	private String status;									//状态
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
