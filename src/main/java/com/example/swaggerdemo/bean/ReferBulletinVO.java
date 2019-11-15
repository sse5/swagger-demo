package com.example.swaggerdemo.bean;

import java.util.Date;

//参考公告
public class ReferBulletinVO {
	private Date disclose_date;// 发布日期
	private String company_code;// 公司代码
	private String bulletin_title;// 公告标题
	private String bulletin_title_keyword;
	private int file_num;// 文件数
	private String coll;// 收藏（是否）
	private int focus_num;// 关注数
	private String type_desc;
	private String bulletin_id;
	private String type_code;
	private String url;//深市公告URL
	private String temp_id;
	private String bulletin_type;//拼接的公告类型

	public String getBulletin_type() {
		return bulletin_type;
	}

	public void setBulletin_type(String bulletin_type) {
		this.bulletin_type = bulletin_type;
	}

	public String getTemp_id() {return temp_id;}

	public void setTemp_id(String temp_id) {this.temp_id = temp_id;}

	public String getType_code() {
		return type_code;
	}

	public void setType_code(String type_code) {
		this.type_code = type_code;
	}

	public String getType_desc() {
		return type_desc;
	}

	public void setType_desc(String type_desc) {
		this.type_desc = type_desc;
	}

	public Date getDisclose_date() {
		return disclose_date;
	}

	public void setDisclose_date(Date disclose_date) {
		this.disclose_date = disclose_date;
	}

	public String getBulletin_title_keyword() {
		return bulletin_title_keyword;
	}

	public void setBulletin_title_keyword(String bulletin_title_keyword) {
		this.bulletin_title_keyword = bulletin_title_keyword;
	}

	public String getBulletin_id() {
		return bulletin_id;
	}

	public void setBulletin_id(String bulletin_id) {
		this.bulletin_id = bulletin_id;
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getBulletin_title() {
		return bulletin_title;
	}

	public void setBulletin_title(String bulletin_title) {
		this.bulletin_title = bulletin_title;
	}

	public int getFile_num() {
		return file_num;
	}

	public void setFile_num(int file_num) {
		this.file_num = file_num;
	}

	public String getColl() {
		return coll;
	}

	public void setColl(String coll) {
		this.coll = coll;
	}

	public int getFocus_num() {
		return focus_num;
	}

	public void setFocus_num(int focus_num) {
		this.focus_num = focus_num;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
