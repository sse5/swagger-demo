package com.example.swaggerdemo.res;

public class OptionalStockRes {


    private String companyCode;

    private String companyAbbr;


    private Integer isOptional;


    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyAbbr() {
        return companyAbbr;
    }

    public void setCompanyAbbr(String companyAbbr) {
        this.companyAbbr = companyAbbr;
    }


    public Integer getIsOptional() {
        return isOptional;
    }

    public void setIsOptional(Integer isOptional) {
        this.isOptional = isOptional;
    }
}
