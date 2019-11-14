package com.example.swaggerdemo.bean;


import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * 返回公共结果集
 * Created by hbzhang on 2018/7/11.
 */
public class ResultApiAppDto {

    private Integer bizCode;//返回码
    private String bizMsg;//错误消息
    private String stockCode;//股票代码
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private String companyName;//公司名称
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private Object content;//内容
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private Integer total;//总记录条数
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private Integer pageNo;//当前页号
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private Integer totalPageNo;//当前页号
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private Integer pageSize;//当前页大小
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private Integer count;//当前页记录数
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private Object domain;//域名
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    private String introduce;//公司管理层介绍

    public ResultApiAppDto(Integer bizCode, String bizMsg, String stockCode, Object content) {
        this.bizCode = bizCode;
        this.bizMsg = bizMsg;
        this.stockCode = stockCode;
        this.content = content;
    }

    public ResultApiAppDto(Integer bizCode, String bizMsg, String stockCode, String companyName, Object content, Object domain) {
        this.bizCode = bizCode;
        this.bizMsg = bizMsg;
        this.stockCode = stockCode;
        this.companyName=companyName;
        this.content = content;
        this.domain = domain;
    }
    public ResultApiAppDto(Integer bizCode, String bizMsg, String stockCode, String companyName, Object content) {
        this.bizCode = bizCode;
        this.bizMsg = bizMsg;
        this.stockCode = stockCode;
        this.companyName = companyName;
        this.content = content;
    }

    public ResultApiAppDto(Integer bizCode, String bizMsg, String stockCode, String companyName, Object content, Integer total, Integer pageNo, Integer totalPageNo, Integer pageSize, Integer count) {
        this.bizCode = bizCode;
        this.bizMsg = bizMsg;
        this.stockCode = stockCode;
        this.companyName = companyName;
        this.content = content;
        this.total = total;
        this.pageNo = pageNo;
        this.totalPageNo = totalPageNo;
        this.pageSize = pageSize;
        this.count = count;
    }
    public ResultApiAppDto(Integer bizCode, String bizMsg, String stockCode, Object content, Integer total, Integer pageNo, Integer totalPageNo, Integer pageSize, Integer count) {
        this.bizCode = bizCode;
        this.bizMsg = bizMsg;
        this.stockCode = stockCode;
        this.content = content;
        this.total = total;
        this.pageNo = pageNo;
        this.totalPageNo = totalPageNo;
        this.pageSize = pageSize;
        this.count = count;
    }

    /**
     * 公司管理层返回结果集
     * @param bizCode
     * @param bizMsg
     * @param stockCode
     * @param companyName
     * @param content
     * @param introduce
     */
    public ResultApiAppDto(Integer bizCode, String bizMsg, String stockCode, String companyName, Object content, String introduce) {
        this.bizCode = bizCode;
        this.bizMsg = bizMsg;
        this.stockCode = stockCode;
        this.companyName = companyName;
        this.content = content;
        this.introduce = introduce;
    }

    public Integer getBizCode() {
        return bizCode;
    }

    public void setBizCode(Integer bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizMsg() {
        return bizMsg;
    }

    public void setBizMsg(String bizMsg) {
        this.bizMsg = bizMsg;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getTotalPageNo() {
        return totalPageNo;
    }

    public void setTotalPageNo(Integer totalPageNo) {
        this.totalPageNo = totalPageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getDomain() {
        return domain;
    }

    public void setDomain(Object domain) {
        this.domain = domain;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
