package com.rc.openapi.dubbo.model;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 订单 商品 model
 * @author acer
 *
 */
public class TGoodModel implements Serializable{
    /**
     * 商品id
     */
	private Long goodsid;
	/**
	 * 商品全称
	 */
	private String goodsName;
	/**
	 * 商品简称
	 */
	private String shortName;
	
	/**
	 * 规格
	 */
	private String spec;
	/**
	 * 缩略图
	 */
	private String abbreviationPicture;
	/**
	 * 商品单价
	 */
	private BigDecimal price ;
	/**
	 * 购买数量
	 */
	private Integer quantity;
	/**
	 * 购买商品总价
	 */
	private BigDecimal sumPrice;
	/**
	 * 退款/退货过程 0 未发起 1 已发起 2 已过期(不允许退货)
	 */
	private Integer refundProcess;
	public Long getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(Long goodsid) {
		this.goodsid = goodsid;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getAbbreviationPicture() {
		return abbreviationPicture;
	}
	public void setAbbreviationPicture(String abbreviationPicture) {
		this.abbreviationPicture = abbreviationPicture;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getSumPrice() {
		if(quantity!=null&&price!=null){
			return price.multiply(new BigDecimal(quantity));
		}else{
			return new BigDecimal("0");
		}
	}
	public Integer getRefundProcess() {
		return refundProcess;
	}
	public void setRefundProcess(Integer refundProcess) {
		this.refundProcess = refundProcess;
	}
	public void setSumPrice(BigDecimal sumPrice) {
		this.sumPrice = sumPrice;
	}
	
	
}
