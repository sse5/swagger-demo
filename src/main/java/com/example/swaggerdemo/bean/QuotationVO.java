package com.example.swaggerdemo.bean;

import io.swagger.annotations.ApiModelProperty;

public class QuotationVO {
	
	@ApiModelProperty(value = "偏离值")
	private String plz_value;			//偏离值
	@ApiModelProperty(value = "市盈率")
	private String pe7;					//市盈率	
	@ApiModelProperty(value = "最新")
	private double last;				//最新
	@ApiModelProperty(value = "换手率")
	private String tuanrate;			//换手率
	@ApiModelProperty(value = "涨跌值")
	private double change;				//涨跌值
	@ApiModelProperty(value = "当日的流通股数(万股)")
	private double curFlowEquity;		//当日的流通股数(万股)
	@ApiModelProperty(value = "总股(万股)")
	private String totalshar;			//总股(万股)
	@ApiModelProperty(value = "最高")
	private double high;				//最高
	@ApiModelProperty(value = "振幅")
	private String amplitude;			//振幅
	@ApiModelProperty(value = "涨跌比率")
	private String chg_rate;			//涨跌比率
	@ApiModelProperty(value = "成交量(万股)")
	private double a_volume; 			//成交量(万股)
	@ApiModelProperty(value = "最低")
	private double low; 				//最低
	@ApiModelProperty(value = "开盘")
	private double open; 				//开盘
	@ApiModelProperty(value = "昨收")
	private double prev_close;			//昨收
	public String getPlz_value() {
		return plz_value;
	}
	public void setPlz_value(String plz_value) {
		this.plz_value = plz_value;
	}
	public String getPe7() {
		return pe7;
	}
	public void setPe7(String pe7) {
		this.pe7 = pe7;
	}
	public double getLast() {
		return last;
	}
	public void setLast(double last) {
		this.last = last;
	}
	public String getTuanrate() {
		return tuanrate;
	}
	public void setTuanrate(String tuanrate) {
		this.tuanrate = tuanrate;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	public double getCurFlowEquity() {
		return curFlowEquity;
	}
	public void setCurFlowEquity(double curFlowEquity) {
		this.curFlowEquity = curFlowEquity;
	}
	public String getTotalshar() {
		return totalshar;
	}
	public void setTotalshar(String totalshar) {
		this.totalshar = totalshar;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public String getAmplitude() {
		return amplitude;
	}
	public void setAmplitude(String amplitude) {
		this.amplitude = amplitude;
	}
	public String getChg_rate() {
		return chg_rate;
	}
	public void setChg_rate(String chg_rate) {
		this.chg_rate = chg_rate;
	}
	public double getA_volume() {
		return a_volume;
	}
	public void setA_volume(double a_volume) {
		this.a_volume = a_volume;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getPrev_close() {
		return prev_close;
	}
	public void setPrev_close(double prev_close) {
		this.prev_close = prev_close;
	}
	
	
	
	
	
	
	
	
}
