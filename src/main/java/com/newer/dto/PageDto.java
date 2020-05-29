package com.newer.dto;

public class PageDto {
	private Integer page = 1;
	private Integer pageSize=3;
	private String key;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		if (page<1) {
			page=1;
		}
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public PageDto() {
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
