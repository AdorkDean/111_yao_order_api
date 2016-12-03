package com.rc.openapi.dubbo.enumc;
/**
 * 退款订单 订单状态枚举
 * @author acer
 *
 */
public enum ReturnStatusEnum {
	/** 未处理 */
	untreated(0,"未处理"),
	/** 已通过 */
	passed(1,"审核通过"),
	/** 未通过 */
	noPass(2,"审核未通过"),
	/** 验货通过 */
	passInspection(3,"验货通过"),
	/** 验货未通过 */
	noPassInspection(4,"验货未通过"),
	/** 退款中 */
	refund(5,"退款中"),
	/** 处理中 */
	processing(6,"处理中"),
	/** 验货中 */
	inspectionGoods(7,"验货中"),
	/** 换货中 */
	replaceGoods(8,"换货中"),
	/** 结束 */
	end(9,"结束");
	
	private String name;  
    private int index;  
    private ReturnStatusEnum(int index,String name) {  
        this.name = name;  
        this.index = index;  
    }  
    /**
     * 获取描述信息
     * @param index
     * @return
     */
    public static String getName(int index) {  
        for (ReturnStatusEnum c : ReturnStatusEnum.values()) {  
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
    public static ReturnStatusEnum getOrderStatusEnum(int index) {  
        for (ReturnStatusEnum c : ReturnStatusEnum.values()) {  
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
