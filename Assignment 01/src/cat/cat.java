package cat;

public class cat {
	private int catWeight;
	private int catCount;
	//private int catTotalWeight;
	
	
	public cat() {
	}

	public cat(int catWeight, int catCount) {
		this.catWeight = catWeight;
		this.catCount = catCount;
		
	}

	public int getCatWeight() {
		return catWeight;
	}

	public void setCatWeight(int catWeight) {
		this.catWeight = catWeight;
	}

	public int getCatCount() {
		return catCount;
	}

	public void setCatCount(int catCount) {
		this.catCount = catCount;
	}

	//public int getCatTotalWeight() {
	//	return catTotalWeight;
	//}

	//public void setCatTotalWeight(int catTotalWeight) {
	//	this.catTotalWeight = catTotalWeight;
	//}
	
	public int CatTotalWeight() {
		return catCount*catWeight;
	}
	public String toSting() {
		return String.format("the total cat weight is :"+CatTotalWeight());
	}
	
}
