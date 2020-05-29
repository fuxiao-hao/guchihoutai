package com.newer.domain;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Backadmin {
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select auto_backadmin.nextval from dual")
	@Id
    private BigDecimal adminid;

    private String adminname;

    private String password;

    private String sex;

    private String phone;

    private String email;

    private String image;

    public BigDecimal getAdminid() {
        return adminid;
    }

    public void setAdminid(BigDecimal adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}