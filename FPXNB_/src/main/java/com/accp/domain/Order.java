package com.accp.domain;

public class Order {
    private Integer orderid;

    private String ordernumber;

    private Integer workerid;

    private Integer quantity;

    private Double amount;

    private String paymenttype;

    private Integer shoppingcartid;

    private Integer receipttype;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Integer getWorkerid() {
        return workerid;
    }

    public void setWorkerid(Integer workerid) {
        this.workerid = workerid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public Integer getShoppingcartid() {
        return shoppingcartid;
    }

    public void setShoppingcartid(Integer shoppingcartid) {
        this.shoppingcartid = shoppingcartid;
    }

    public Integer getReceipttype() {
        return receipttype;
    }

    public void setReceipttype(Integer receipttype) {
        this.receipttype = receipttype;
    }
}