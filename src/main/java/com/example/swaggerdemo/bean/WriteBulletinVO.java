package com.example.swaggerdemo.bean;

public class WriteBulletinVO {
	
	private String typeCode;//公告类别编码
	private String typeDesc;//公告类别描述
	private String tempFilePath;//模板文件路径
	private String tempName;//模板名称
	private Long id;//模板id
	private String parentTypeCode; //公告父类编码
	private String parentTypeDesc; //公告父类描述
	
	
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	public String getTempFilePath() {
		return tempFilePath;
	}
	public void setTempFilePath(String tempFilePath) {
		this.tempFilePath = tempFilePath;
	}
	public String getTempName() {
		return tempName;
	}
	public void setTempName(String tempName) {
		this.tempName = tempName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getParentTypeCode() {
		return parentTypeCode;
	}
	public void setParentTypeCode(String parentTypeCode) {
		this.parentTypeCode = parentTypeCode;
	}
	public String getParentTypeDesc() {
		return parentTypeDesc;
	}
	public void setParentTypeDesc(String parentTypeDesc) {
		this.parentTypeDesc = parentTypeDesc;
	}
	
	
}
