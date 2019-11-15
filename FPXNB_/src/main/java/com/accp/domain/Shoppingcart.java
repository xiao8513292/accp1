package com.accp.domain;

public class Shoppingcart {
    private Integer shoppingcartid;

    private Integer goodstotal;

    private Double goodstotalmoney;

    private Integer status;

    public Integer getShoppingcartid() {
        return shoppingcartid;
    }

    public void setShoppingcartid(Integer shoppingcartid) {
        this.shoppingcartid = shoppingcartid;
    }

    public Integer getGoodstotal() {
        return goodstotal;
    }

    public void setGoodstotal(Integer goodstotal) {
        this.goodstotal = goodstotal;
    }

    public Double getGoodstotalmoney() {
        return goodstotalmoney;
    }

    public void setGoodstotalmoney(Double goodstotalmoney) {
        this.goodstotalmoney = goodstotalmoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}