package com.accp.domain;

import java.util.Date;

public class Purchaselist {
    private Integer purchaselistid;

    private String dingle;

    private Date deliverydate;

    private Integer suppliersid;

    private String monogragh;

    private String remark;

    private Integer sum;

    private Double amount;

    private Integer goodid;

    public Integer getPurchaselistid() {
        return purchaselistid;
    }

    public void setPurchaselistid(Integer purchaselistid) {
        this.purchaselistid = purchaselistid;
    }

    public String getDingle() {
        return dingle;
    }

    public void setDingle(String dingle) {
        this.dingle = dingle;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Integer getSuppliersid() {
        return suppliersid;
    }

    public void setSuppliersid(Integer suppliersid) {
        this.suppliersid = suppliersid;
    }

    public String getMonogragh() {
        return monogragh;
    }

    public void setMonogragh(String monogragh) {
        this.monogragh = monogragh;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }
}