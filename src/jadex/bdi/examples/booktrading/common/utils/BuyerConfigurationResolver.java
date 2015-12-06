package jadex.bdi.examples.booktrading.common.utils;

import java.util.LinkedList;
import java.util.List;

import jadex.bdi.examples.booktrading.common.Order;
import jadex.bridge.service.types.clock.IClockService;

public class BuyerConfigurationResolver  extends AgentConfigurationResolver {

	public BuyerConfigurationResolver() {
		this.setItemLabel(" Books to buy ");
		this.setGoalName( "purchase_book");
		this.setAddOrderLabel("Add new purchase order");
	}
	
	@Override
	public void setUpOrders(IClockService clock) {
		List<Order> orders = new LinkedList<Order>();
		orders.add(new Order("All about agents", null, 100, 120, true, clock));
		orders.add(new Order("All about web services", null, 40, 60, true, clock));
		orders.add(new Order("Harry Potter", null, 5, 10, true, clock));
		orders.add(new Order("Agents in the real world", null, 30, 65, true, clock));
	
		this.setOrders(orders);
	}
	
	@Override
	public boolean isBuyer() {
		return true;
	}
}
