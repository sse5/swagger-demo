package com.example.swaggerdemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "消息设置")
public class MessageSettingVo {
	@ApiModelProperty(value = "接收消息：1:开;2:关;")
	private String receiveMessages;
	@ApiModelProperty(value = "短信：1:开;2:关;")
	private String SMS;
}
