package practiceAssign;

public class golfClub {
	private String name;
	private int distance;


	
	public golfClub(String club, int x) {
		
		this.name = club;
		this.distance = x;
	}

	public void display() {
	System.out.println("" + this.name + " , " + this.distance);
	}

}