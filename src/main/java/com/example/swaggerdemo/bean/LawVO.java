package com.example.swaggerdemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * desc : 法律法规实体
 * @author Administrator
 *
 */
@ApiModel(description= "法律法规")
public class LawVO {
	@ApiModelProperty(value = "文件ID")
	private long id;								//主键ID
	@ApiModelProperty(value = "文件名")
	private String fileName;						//文件名
	@ApiModelProperty(value = "文件路径")
	private String filePath;						//文件路径
	@ApiModelProperty(value = "文件服务器url")
	private String fileUrl;							//文件服务器url
	@ApiModelProperty(value = "生效时间")
	private String updateTime;						//生效时间
	@ApiModelProperty(value = "位阶ID")
	private String hierarchyId;						//位阶ID
	@ApiModelProperty(value = "位阶描述")
	private String hierarchyDesc;					//位阶描述
	@ApiModelProperty(value = "上传部门")
	private String uploadDept;						//上传部门
	@ApiModelProperty(value = "是否置顶：1:是;0:否")
	private String isTop;							//是否置顶
	@ApiModelProperty(value = "业务描述")
	private String biztypeDesc;						//业务描述
	@ApiModelProperty(value = "是否收藏：1:是;0:否")
	private String isFavorite;						//是否收藏
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getHierarchyId() {
		return hierarchyId;
	}
	public void setHierarchyId(String hierarchyId) {
		this.hierarchyId = hierarchyId;
	}
	public String getHierarchyDesc() {
		return hierarchyDesc;
	}
	public void setHierarchyDesc(String hierarchyDesc) {
		this.hierarchyDesc = hierarchyDesc;
	}
	public String getUploadDept() {
		return uploadDept;
	}
	public void setUploadDept(String uploadDept) {
		this.uploadDept = uploadDept;
	}
	public String getIsTop() {
		return isTop;
	}
	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}
	public String getBiztypeDesc() {
		return biztypeDesc;
	}
	public void setBiztypeDesc(String biztypeDesc) {
		this.biztypeDesc = biztypeDesc;
	}
	public String getIsFavorite() {
		return isFavorite;
	}
	public void setIsFavorite(String isFavorite) {
		this.isFavorite = isFavorite;
	}
	
}
