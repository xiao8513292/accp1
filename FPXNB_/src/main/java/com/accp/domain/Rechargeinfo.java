package com.accp.domain;

import java.util.Date;

public class Rechargeinfo {
    private Integer rechargeinfoid;

    private Date date;

    private String weixin;

    private String name;

    private Integer phone;

    private Double recharge;

    private Double presented;

    private Double consume;

    private Double balance;

    private String remark;

    public Integer getRechargeinfoid() {
        return rechargeinfoid;
    }

    public void setRechargeinfoid(Integer rechargeinfoid) {
        this.rechargeinfoid = rechargeinfoid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Double getRecharge() {
        return recharge;
    }

    public void setRecharge(Double recharge) {
        this.recharge = recharge;
    }

    public Double getPresented() {
        return presented;
    }

    public void setPresented(Double presented) {
        this.presented = presented;
    }

    public Double getConsume() {
        return consume;
    }

    public void setConsume(Double consume) {
        this.consume = consume;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}