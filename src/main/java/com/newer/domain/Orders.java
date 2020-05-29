package com.newer.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Orders {
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select auto_orders.nextval from dual")
	@Column(name = "orderId")
	@Id
	private Long orderId;
	private Integer accountid;
	private String shipid;
	private Date ordertime;
	private Integer orderprice;
	private String orderstatus;
	private String paymentway;
	private String payaccount;
	private Date paytime;
	private Date deliverytime;
	private String deliveryperson;
	private Date Receiptconfirmationtime;
	private String Receiptaddress;
	private String consignee;
	private String paystatus;
	private Date settlementdate;
	private String trackingnumber;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Integer getAccountid() {
		return accountid;
	}
	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}
	public String getShipid() {
		return shipid;
	}
	public void setShipid(String shipid) {
		this.shipid = shipid;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public Integer getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(Integer orderprice) {
		this.orderprice = orderprice;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public String getPaymentway() {
		return paymentway;
	}
	public void setPaymentway(String paymentway) {
		this.paymentway = paymentway;
	}
	public String getPayaccount() {
		return payaccount;
	}
	public void setPayaccount(String payaccount) {
		this.payaccount = payaccount;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Date getPaytime() {
		return paytime;
	}
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Date getDeliverytime() {
		return deliverytime;
	}
	public void setDeliverytime(Date deliverytime) {
		this.deliverytime = deliverytime;
	}
	public String getDeliveryperson() {
		return deliveryperson;
	}
	public void setDeliveryperson(String deliveryperson) {
		this.deliveryperson = deliveryperson;
	}
	public Date getReceiptconfirmationtime() {
		return Receiptconfirmationtime;
	}
	public void setReceiptconfirmationtime(Date receiptconfirmationtime) {
		Receiptconfirmationtime = receiptconfirmationtime;
	}
	public String getReceiptaddress() {
		return Receiptaddress;
	}
	public void setReceiptaddress(String receiptaddress) {
		Receiptaddress = receiptaddress;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Date getSettlementdate() {
		return settlementdate;
	}
	public void setSettlementdate(Date settlementdate) {
		this.settlementdate = settlementdate;
	}
	public String getTrackingnumber() {
		return trackingnumber;
	}
	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
	}
	public Orders(Long orderId, Integer accountid, String shipid, Date ordertime, Integer orderprice,
			String orderstatus, String paymentway, String payaccount, Date paytime, Date deliverytime,
			String deliveryperson, Date receiptconfirmationtime, String receiptaddress, String consignee,
			String paystatus, Date settlementdate, String trackingnumber) {
		this.orderId = orderId;
		this.accountid = accountid;
		this.shipid = shipid;
		this.ordertime = ordertime;
		this.orderprice = orderprice;
		this.orderstatus = orderstatus;
		this.paymentway = paymentway;
		this.payaccount = payaccount;
		this.paytime = paytime;
		this.deliverytime = deliverytime;
		this.deliveryperson = deliveryperson;
		Receiptconfirmationtime = receiptconfirmationtime;
		Receiptaddress = receiptaddress;
		this.consignee = consignee;
		this.paystatus = paystatus;
		this.settlementdate = settlementdate;
		this.trackingnumber = trackingnumber;
	}
	public Orders() {
	}

	
}