package com.example.swaggerdemo.bean;

import io.swagger.annotations.ApiModelProperty;

/**
 * desc : 业务实体
 * @author Administrator
 *
 */
public class Biztype {
	@ApiModelProperty(value = "主键")
	private int id;					//主键
	@ApiModelProperty(value = "业务名称")
	private String biztypeName;		//业务名称

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBiztypeName() {
		return biztypeName;
	}

	public void setBiztypeName(String biztypeName) {
		this.biztypeName = biztypeName;
	}

	
}
