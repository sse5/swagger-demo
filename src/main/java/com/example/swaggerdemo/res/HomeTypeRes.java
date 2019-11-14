package com.example.swaggerdemo.res;

import java.util.List;

public class HomeTypeRes {

    private String typeName;

    private String typeOrder;



    private List<HomeFunctionRes> homeFunctionResList;


    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeOrder() {
        return typeOrder;
    }

    public void setTypeOrder(String typeOrder) {
        this.typeOrder = typeOrder;
    }

    public List<HomeFunctionRes> getHomeFunctionResList() {
        return homeFunctionResList;
    }

    public void setHomeFunctionResList(List<HomeFunctionRes> homeFunctionResList) {
        this.homeFunctionResList = homeFunctionResList;
    }
}
