package com.example.swaggerdemo.res;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "自选舆情")
public class ZxTopicRes {


    @ApiModelProperty(value = "状态")
   private String  status;
    @ApiModelProperty(value = "结果")
   private String result ;








}
