package org.z.order.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.z.order.provider.order.OrderOperateServiceImpl;

public class TestOrder {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(TestOrder.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		OrderOperateServiceImpl bean = context.getBean(OrderOperateServiceImpl.class);
		Integer orderId = bean.generateOrder("苹果6s");
		logger.debug("{}", orderId);
	}
}
