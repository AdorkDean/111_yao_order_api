package com.rc.openapi.dubbo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 退款订单 封装model
 * 
 * @author acer
 * 
 */
public class TOrderReturnModel implements Serializable {

	private static final long serialVersionUID = -2598056252378292374L;

	private List<TGoodModel> goodsList = new ArrayList<TGoodModel>();

	private Long id;

	/**
	 * 订单号
	 */
	private String orderSn;

	/**
	 * 服务类型退货 Refunds(0), 换货 exchange(1) ,2:退款(无需退货)
	 */
	private Integer serviceType;

	/**
	 * 快递单号
	 */
	private String expressDelivery;

	/**
	 * 快递公司
	 */
	private String expressCompany;

	/**
	 * 发货人电话
	 */
	private String shipperPhone;

	/**
	 * 会员id
	 */
	private Long memberId;

	/**
	 * 退款金额
	 */
	private BigDecimal refundAmount;

	/**
	 * 退款描述
	 */
	private String refundDescribe;

	/**
	 * 订单状态
	 */
	private Integer orderStatus;

	/**
	 * 退款账号
	 */
	private String refundAccount;

	/**
	 * 退款银行
	 */
	private String refundBank;

	/**
	 * 退款备注
	 */
	private String refundRemark;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 原订单id
	 */
	private Long oldOrderId;

	/**
	 * 完成时间
	 */
	private Date finishDt;

	private String userName;
	private String oldOrderSn;

	public List<TGoodModel> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<TGoodModel> goodsList) {
		this.goodsList = goodsList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public String getExpressDelivery() {
		return expressDelivery;
	}

	public void setExpressDelivery(String expressDelivery) {
		this.expressDelivery = expressDelivery;
	}

	public String getExpressCompany() {
		return expressCompany;
	}

	public void setExpressCompany(String expressCompany) {
		this.expressCompany = expressCompany;
	}

	public String getShipperPhone() {
		return shipperPhone;
	}

	public void setShipperPhone(String shipperPhone) {
		this.shipperPhone = shipperPhone;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundDescribe() {
		return refundDescribe;
	}

	public void setRefundDescribe(String refundDescribe) {
		this.refundDescribe = refundDescribe;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getRefundAccount() {
		return refundAccount;
	}

	public void setRefundAccount(String refundAccount) {
		this.refundAccount = refundAccount;
	}

	public String getRefundBank() {
		return refundBank;
	}

	public void setRefundBank(String refundBank) {
		this.refundBank = refundBank;
	}

	public String getRefundRemark() {
		return refundRemark;
	}

	public void setRefundRemark(String refundRemark) {
		this.refundRemark = refundRemark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getOldOrderId() {
		return oldOrderId;
	}

	public void setOldOrderId(Long oldOrderId) {
		this.oldOrderId = oldOrderId;
	}

	public Date getFinishDt() {
		return finishDt;
	}

	public void setFinishDt(Date finishDt) {
		this.finishDt = finishDt;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOldOrderSn() {
		return oldOrderSn;
	}

	public void setOldOrderSn(String oldOrderSn) {
		this.oldOrderSn = oldOrderSn;
	}

}
