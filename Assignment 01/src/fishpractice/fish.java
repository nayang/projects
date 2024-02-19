package fishpractice;

public class fish {
	private int fishNumber;
	private double averageWeightPerFish;
	private double totalWeight;
	
	public fish() {}
	public fish(int fishNumber,double averageWeightPerFish) {
		this.fishNumber = fishNumber;
		this.averageWeightPerFish = averageWeightPerFish;
	}
	
	public int getFishNumber() {
		return fishNumber;
	}
	public void setFishNumber(int fishNumber) {
		this.fishNumber = fishNumber;
	}
	
	public double getAverageWeightPerFish() {
		return averageWeightPerFish;
	}
	public void setAverageWeightPerFish(double averageWeightPerFish) {
		this.averageWeightPerFish = averageWeightPerFish;
	}
	
	public double totalWeight() {
		totalWeight = fishNumber * averageWeightPerFish;
		return totalWeight;
	}
	
	public String toString() {
		return String.format("The total estimated weight caught (in kg) is : %.2f %s",totalWeight(),"kg");
	}
}
