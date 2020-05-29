package com.newer.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Shippinginfo {
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select auto_shippinginfo.nextval from dual")
	@Id
	private String shipid;

    private String shipname;

    private String shipcontact;

    private String telephone;

    private BigDecimal price;
   
    private Date modifiedtime;

    public String getShipid() {
        return shipid;
    }

    public void setShipid(String shipid) {
        this.shipid = shipid;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getShipcontact() {
        return shipcontact;
    }

    public void setShipcontact(String shipcontact) {
        this.shipcontact = shipcontact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }
}