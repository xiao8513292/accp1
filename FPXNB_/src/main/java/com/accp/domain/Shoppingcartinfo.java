package com.accp.domain;

public class Shoppingcartinfo {
    private Integer shoppingcartid;

    private String goodname;

    private Integer goodquantuty;

    private Double subtotal;

    private Integer goodid;

    private Double goodprice;

    private Double gooddiscount;

    public Integer getShoppingcartid() {
        return shoppingcartid;
    }

    public void setShoppingcartid(Integer shoppingcartid) {
        this.shoppingcartid = shoppingcartid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public Integer getGoodquantuty() {
        return goodquantuty;
    }

    public void setGoodquantuty(Integer goodquantuty) {
        this.goodquantuty = goodquantuty;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Double getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(Double goodprice) {
        this.goodprice = goodprice;
    }

    public Double getGooddiscount() {
        return gooddiscount;
    }

    public void setGooddiscount(Double gooddiscount) {
        this.gooddiscount = gooddiscount;
    }
}