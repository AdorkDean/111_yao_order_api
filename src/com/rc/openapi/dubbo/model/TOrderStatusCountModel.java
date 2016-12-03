package com.rc.openapi.dubbo.model;

import java.io.Serializable;

/**
 * 订单各个状态个数统计
 * @author acer
 *
 */
public class TOrderStatusCountModel implements Serializable{
	/**
     * 待支付
     */
	private int orderNoPay =0; 
	/**
     * 待发货
     */
	private int orderPay=0; 
	/**
     * 待收货
     */
	private int orderDelivery=0; 
	/**
     * 已完成
     */
	private int orderFinish=0; 
	/**
     * 已取消
     */
	private int orderCancel=0;
	/**
     * 已过期
     */
	private int orderOverdue=0; 
	/**
     * 已关闭
     */
	private int orderClose=0;
	/**
	 *待评价 
	 */
	private int orderRev=0;
	
	
	
	public int getOrderRev() {
		return orderRev;
	}
	public void setOrderRev(int orderRev) {
		this.orderRev = orderRev;
	}
	public int getOrderNoPay() {
		return orderNoPay;
	}
	public void setOrderNoPay(int orderNoPay) {
		this.orderNoPay = orderNoPay;
	}
	public int getOrderPay() {
		return orderPay;
	}
	public void setOrderPay(int orderPay) {
		this.orderPay = orderPay;
	}
	public int getOrderDelivery() {
		return orderDelivery;
	}
	public void setOrderDelivery(int orderDelivery) {
		this.orderDelivery = orderDelivery;
	}
	public int getOrderFinish() {
		return orderFinish;
	}
	public void setOrderFinish(int orderFinish) {
		this.orderFinish = orderFinish;
	}
	public int getOrderCancel() {
		return orderCancel;
	}
	public void setOrderCancel(int orderCancel) {
		this.orderCancel = orderCancel;
	}
	public int getOrderOverdue() {
		return orderOverdue;
	}
	public void setOrderOverdue(int orderOverdue) {
		this.orderOverdue = orderOverdue;
	}
	public int getOrderClose() {
		return orderClose;
	}
	public void setOrderClose(int orderClose) {
		this.orderClose = orderClose;
	} 
	
	
}
