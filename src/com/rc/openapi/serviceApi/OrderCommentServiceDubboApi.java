package com.rc.openapi.serviceApi;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.rc.openapi.dubbo.vo.TOrderItem;

/**
 * 商品评价
 * 
 * @author WWF
 * @createTime 2016-8-25 上午9:52:42
 */
public interface OrderCommentServiceDubboApi {
	
	/**
	 * 提交评论
	 * @param memberId用户信息;
	 * @param orderId订单ID;
	 * @param goodId商品ID;
	 * @param score评分;
	 * @param content内容;
	 * @param imgList图片base64串;
	 * @param imgFilesList图片文件;
	 * @throws SQLException 
	 * @throws Exception 
	 */
	public boolean submitOrderComment(long memberId, long orderId, long goodId, int score, String content,
			List<String> imgList, List<File> imgFilesList) throws SQLException, Exception;

	/**
	 * 取未退换货的商品项
	 * @param orderId
	 * @param memberId
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public List<TOrderItem> getNoReturnGoods(long orderId, long memberId) throws SQLException, Exception;
	
}
