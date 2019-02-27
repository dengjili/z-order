package org.z.order.provider.order;

import org.springframework.stereotype.Component;
import org.z.order.api.ITestQuery;

@Component("testService")
public class TestQueryImpl implements ITestQuery {

	@Override
	public String sayHello(String name) {
		System.out.println("接收到：" + name);
		return "这里是李四";
	}

}
