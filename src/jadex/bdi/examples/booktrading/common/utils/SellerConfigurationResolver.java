package jadex.bdi.examples.booktrading.common.utils;

import java.util.LinkedList;
import java.util.List;

import jadex.bdi.examples.booktrading.common.Order;
import jadex.bridge.service.types.clock.IClockService;

public class SellerConfigurationResolver extends AgentConfigurationResolver {

	public SellerConfigurationResolver() {
		this.setItemLabel(" Books to sell ");
		this.setGoalName( "sell_book");
		this.setAddOrderLabel("Add new sell order");
	}
	
	@Override
	public void setUpOrders(IClockService clock) {
		List<Order> orders = new LinkedList<Order>();
		
		orders.add(new Order("All about agents", null, 130, 110, false, clock));
		orders.add(new Order("All about web services", null, 50, 30, false, clock));
		orders.add(new Order("Harry Potter", null, 15, 9, false, clock));
		orders.add(new Order("Agents asdan the real world", null, 100, 60, false, clock));
	
		this.setOrders(orders);
	}
}
