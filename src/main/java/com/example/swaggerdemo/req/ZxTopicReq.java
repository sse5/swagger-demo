package com.example.swaggerdemo.req;


import lombok.Data;

@Data
public class ZxTopicReq {

    private String startTime;
    private String endTime;
    private String keyWords;
    private String platform;
    private int emotion;
    private int is_filter;
    private String orderName;
    private String intorderType;
    private int queryType;
    private String tagCodes;
    private String tagNames;
    private String categories;
    private String currentPage;
    private String size;


}
