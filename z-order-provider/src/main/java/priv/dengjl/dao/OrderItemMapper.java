package priv.dengjl.dao;

import org.springframework.stereotype.Repository;

import priv.dengjl.bean.OrderItem;

@Repository
public interface OrderItemMapper {
	void addOrderItem(OrderItem orderItem);
}