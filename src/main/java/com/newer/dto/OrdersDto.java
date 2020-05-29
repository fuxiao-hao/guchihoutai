package com.newer.dto;

public class OrdersDto extends PageDto{
//	orders
//	orderdetail
//	shippinginfo 
//	shoes 
	private Long orderId;
	private String trackingnumber;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getTrackingnumber() {
		return trackingnumber;
	}
	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
	}
	public OrdersDto(Long orderId, String trackingnumber) {
		this.orderId = orderId;
		this.trackingnumber = trackingnumber;
	}
	public OrdersDto() {
	}
	
}