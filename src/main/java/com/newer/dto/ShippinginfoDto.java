package com.newer.dto;

public class ShippinginfoDto extends PageDto{
    private String shipname;

    private String shipcontact;

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

	public ShippinginfoDto(String shipname, String shipcontact) {
		this.shipname = shipname;
		this.shipcontact = shipcontact;
	}

	public ShippinginfoDto() {
	}
    
}
