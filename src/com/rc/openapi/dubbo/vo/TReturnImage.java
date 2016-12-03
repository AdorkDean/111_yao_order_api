package com.rc.openapi.dubbo.vo;

import java.io.Serializable;

public class TReturnImage implements Serializable{
	/**
	 * 主键ID
	 */
	private Long id;

	/**
	 * 图片地址
	 */
	private String imageUrl;

	/**
	 * 退换货订单ID
	 */
	private Long returnId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Long getReturnId() {
		return returnId;
	}

	public void setReturnId(Long returnId) {
		this.returnId = returnId;
	}
}