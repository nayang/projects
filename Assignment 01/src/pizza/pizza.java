package pizza;

public class pizza {
	private double countTopping;
	private double costPerTopping;
	private double totalToppingCost;
	
	public pizza() {}
	public pizza(double countTopping,double costPerTopping,double totalToppingCost) {
		this.countTopping = countTopping;
		this.costPerTopping = costPerTopping;
		this.totalToppingCost = totalToppingCost;
	}
	public double getCountTopping() {
		return countTopping;
	}
	public void setCountTopping(double countTopping) {
		this.countTopping = countTopping;
	}
	
	public double getCostPerTopping() {
		return costPerTopping;
	}
	public void setCostPerTopping(double costPerTopping) {
		this.costPerTopping = costPerTopping;
	}
	
	public double getTotalToppingCost() {
		return totalToppingCost;
	}
	public void setTotalToppingCost(double totalToppingCost) {
		this.totalToppingCost = totalToppingCost;
	}
	public double calculateTotalToppingCost() {
		return costPerTopping * countTopping;
	}
	public String toString() {
		return String.format("calculateTotalToppingCost() reports: %.4f",calculateTotalToppingCost());
	}
}
