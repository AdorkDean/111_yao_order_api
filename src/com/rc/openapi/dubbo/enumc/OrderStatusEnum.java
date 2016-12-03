package com.rc.openapi.dubbo.enumc;
/**
 * 订单状态枚举
 * @author acer
 *
 */
public enum OrderStatusEnum {
    /**
     * 待支付
     */
	ORDER_NO_PAY(0, "待支付"), 
	/**
     * 待发货
     */
	ORDER_PAY(1, "待发货"), 
	/**
     * 待收货
     */
	ORDER_DELIVERY(2, "待收货"), 
	/**
     * 已完成
     */
	ORDER_FINISH(3, "已完成"),
	/**
     * 已取消
     */
	ORDER_CANCEL(4, "已取消"),
	/**
     * 已过期
     */
	ORDER_OVERDUE(5, "已过期"),
	/**
     * 已关闭
     */
	ORDER_CLOSE(6, "已关闭");
	
    private String name;  
    private int index;  
    private OrderStatusEnum(int index,String name) {  
        this.name = name;  
        this.index = index;  
    }  
    /**
     * 获取描述信息
     * @param index
     * @return
     */
    public static String getName(int index) {  
        for (OrderStatusEnum c : OrderStatusEnum.values()) {  
            if (c.getIndex() == index) {  
                return c.name;  
            }  
        }  
        return null;  
    }  
    /**
     * 获取枚举对象
     * @param index
     * @return
     */
    public static OrderStatusEnum getOrderStatusEnum(int index) {  
        for (OrderStatusEnum c : OrderStatusEnum.values()) {  
            if (c.getIndex() == index) {  
                return c;  
            }  
        }  
        return null;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getIndex() {  
        return index;  
    }  
    public void setIndex(int index) {  
        this.index = index;  
    }  
}
