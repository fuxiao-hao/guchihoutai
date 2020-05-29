package com.newer.dto;

public class ShoesDto extends PageDto{
	private String shoesname;

    private String status;

	public String getShoesname() {
		return shoesname;
	}

	public void setShoesname(String shoesname) {
		this.shoesname = shoesname;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ShoesDto(String shoesname, String status) {
		super();
		this.shoesname = shoesname;
		this.status = status;
	}

	public ShoesDto() {
	}
    
}
