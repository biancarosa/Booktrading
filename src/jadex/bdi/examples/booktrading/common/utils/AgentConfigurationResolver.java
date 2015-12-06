package jadex.bdi.examples.booktrading.common.utils;

import java.util.List;

import jadex.bdi.examples.booktrading.common.Order;
import jadex.bridge.service.types.clock.IClockService;

public abstract class AgentConfigurationResolver {

	private String itemLabel;
	private String goalName;
	private String addOrderLabel;
	private List<Order> orders;
	
	public String getItemLabel() {
		return itemLabel;
	}
	public void setItemLabel(String itemLabel) {
		this.itemLabel = itemLabel;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public String getAddOrderLabel() {
		return addOrderLabel;
	}
	public void setAddOrderLabel(String addOrderLabel) {
		this.addOrderLabel = addOrderLabel;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public abstract void setUpOrders(IClockService clock);
	
	/** 
	 * Default is false.
	 * 
	 * @return
	 */
	public boolean isBuyer() {
		return false;
	}
}
