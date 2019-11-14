package com.example.swaggerdemo.bean;

/**
 *
 * Created on 2014-1-23
 * <p>Title:       [公用结果集]/p>
 * <p>Description: [定义结果集数据]</p>
 * <p>Copyright:   Copyright (c) 2011</p>
 * <p>Company:     上证所网络信息有限公司</p>
 * <p>Department:  网站运维部</p>
 * @author         fengll
 */
public class ResultDto {

	public  String code;
	public  String message;
	public  boolean resustBool;

	public ResultDto(){
	}
	public ResultDto(String message){

		this.resustBool = true;
	}

	public ResultDto(String code,String message){

		this.code = code;
		this.message = message;
		this.resustBool = false;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isResustBool() {
		return resustBool;
	}

	public void setResustBool(boolean resustBool) {
		this.resustBool = resustBool;
	}

}
