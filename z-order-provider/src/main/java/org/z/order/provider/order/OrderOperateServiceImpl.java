package org.z.order.provider.order;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.z.order.api.IOrderOperateService;

import priv.dengjl.bean.OrderItem;
import priv.dengjl.dao.OrderItemMapper;

@Component("orderOperateService")
public class OrderOperateServiceImpl implements IOrderOperateService {

	@Autowired
	private OrderItemMapper orderDao;
	
	@Override
	public Integer generateOrder(String orderName) {
		OrderItem orderItem =  new OrderItem();
		int orderId = new Random().nextInt(Integer.MAX_VALUE);
		orderItem.setOrderId(orderId);
		orderItem.setOrderName(orderName);
		orderDao.addOrderItem(orderItem);
		return orderId;
	}

}
