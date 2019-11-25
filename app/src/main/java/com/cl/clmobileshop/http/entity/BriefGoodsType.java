package com.cl.clmobileshop.http.entity;

public class BriefGoodsType {
    private int type_id;
    private String name;
    private String params;

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "BriefGoodsType{" +
                "type_id=" + type_id +
                ", name='" + name + '\'' +
                ", params='" + params + '\'' +
                '}';
    }
}
