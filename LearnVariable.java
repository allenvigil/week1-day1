package week1.day1;

public class LearnVariable {
	
	String model = "realme";
	int weight = 100;
	Boolean charge = true;
	
	public void mobileModel() {
		System.out.println(model);
	}
	
	public void mobileWeight() {
		System.out.println(weight);
	}
	
	public void isFullyCharged() {
		System.out.println(charge);
	}

	public static void main(String[] args) {
		
		LearnVariable lv = new LearnVariable();
		
		lv.mobileModel();
		lv.mobileWeight();
		lv.isFullyCharged();
	}

}
