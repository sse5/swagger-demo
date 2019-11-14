package com.example.swaggerdemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "登录设置")
public class LoginSettingVo {
	@ApiModelProperty(value = "手势：1:开;2:关;")
	private String gesture;
	@ApiModelProperty(value = "指纹：1:开;2:关;")
	private String fingerprint;
	@ApiModelProperty(value = "面容：1:开;2:关;")
	private String face;
	public String getGesture() {
		return gesture;
	}
	public void setGesture(String gesture) {
		this.gesture = gesture;
	}
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public LoginSettingVo(String gesture, String fingerprint, String face) {
		super();
		this.gesture = gesture;
		this.fingerprint = fingerprint;
		this.face = face;
	}
	public LoginSettingVo() {
		super();
	}
	
	
	
}
