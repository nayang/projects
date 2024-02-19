package Fish;

public class Fish {
	private int numberFish;
	private double averageWeightPerFish;
	private double totalWeight;
	
	public Fish() {}
	public Fish(int numberFish,double averageWeightPerFish,double totalWeight) {
		this.numberFish = numberFish;
		this.averageWeightPerFish = averageWeightPerFish;
		this.totalWeight = totalWeight;
	}
	
	public int getNumberFish() {
		return numberFish;
	}
	public void setNumberFish(int numberFish) {
		this.numberFish = numberFish;
	}
	
	public double getAverageWeightPerFish() {
		return averageWeightPerFish;
	}
	public void setAverageWeightPerFish(double averageWeightPerFish) {
		this.averageWeightPerFish = averageWeightPerFish;
	}
	public double getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	public double calculateTotalWeight() {
		
		return totalWeight = numberFish*averageWeightPerFish;
	}
}
