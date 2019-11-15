package com.accp.domain;

public class Goodsinfo {
    private Integer goodid;

    private String barcode;

    private Integer colorid;

    private Integer sizeid;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }
}