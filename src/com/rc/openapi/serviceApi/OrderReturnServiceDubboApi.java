package com.rc.openapi.serviceApi;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rc.app.framework.webapp.model.page.PageWraper;
import com.rc.openapi.dubbo.vo.TReturn;

/**
 * 订单退款退货 dubbo服务 对外提供接口
 * 
 * @author 刘志强
 * @version v1.0
 */
public interface OrderReturnServiceDubboApi {
	
	/**
	 * 
	 * @param price_type
	 *            平台字符串(pc,wap,app);
	 * @param orderId 订单ID
	 * @param returnType 退换货类型(0:退货,2:退款);
	 * @param returnRemark 退款说明;
	 * @param imgs 凭证图片;(base64图片字符串,不带前缀<data:image/JPG;base64,>,此处用在app客户端)
	 * @param fileList
	 * @param returnParam<商品ID:数量>
	 *            :商品id及数量;
	 *            一个商品只能退一次,
	 * @return
	 * @throws Exception
	 */
	public boolean submitReturnInfo(String price_type,long orderId, String returnType, String returnRemark, List<String> imgs,
			List<File> fileList, Map<Long, Integer> returnParam) throws Exception;
	
	/**
	 * 查询退款退货订单  分页查询
	 * @param memberid 用户id
	 * @param returnOrderNo 退款退货订单编号
	 * @param orderStatus   退款订单状态集合
	 * @param fromDate   退款订单创建开始时间 YYYY-MM-dd 
	 * @param toDate 退款订单创建结束时间 YYYY-MM-dd
	 * @param page   当前页
	 * @param pagesize  每页显示多少条
	 * @return  PageWraper
	 * @throws Exception
	 */
	public PageWraper getOrderReturn (long memberid,String returnOrderNo,List<Integer> orderStatus,Date fromDate,Date toDate,int page,
			int pagesize,List<Integer> serviceTypeList) throws Exception;

	
	public PageWraper getAllOrderReturn (String userName,String returnOrderNo,String refundDescribe,List<Integer> orderStatus,Date fromDate,Date toDate,int page,
			int pagesize,List<Integer> serviceTypeList) throws Exception;
	
	public TReturn getOrderReturnById (long id) throws Exception;
	
}
