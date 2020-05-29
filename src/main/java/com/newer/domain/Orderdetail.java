package com.newer.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Orderdetail {
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select auto_orderdetail.nextval from dual")
	@Id
    private BigDecimal detailid;

    private BigDecimal shoesid;

    private BigDecimal styleid;

    private String orderid;

    private BigDecimal shoescount;

    private BigDecimal price;

    public BigDecimal getDetailid() {
        return detailid;
    }

    public void setDetailid(BigDecimal detailid) {
        this.detailid = detailid;
    }

    public BigDecimal getShoesid() {
        return shoesid;
    }

    public void setShoesid(BigDecimal shoesid) {
        this.shoesid = shoesid;
    }

    public BigDecimal getStyleid() {
        return styleid;
    }

    public void setStyleid(BigDecimal styleid) {
        this.styleid = styleid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getShoescount() {
        return shoescount;
    }

    public void setShoescount(BigDecimal shoescount) {
        this.shoescount = shoescount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}