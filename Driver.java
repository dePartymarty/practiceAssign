package practiceAssign;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		golfClub putter = new golfClub("Putter", 20);
		golfClub SW = new golfClub("SW", 70);
		golfClub GW = new golfClub("GW", 90);
		golfClub PW = new golfClub("PW", 100);
		golfClub iron9 = new golfClub("9 Iron", 115);
		golfClub iron8 = new golfClub("8 Iron", 130);
		golfClub iron7 = new golfClub("7 Iron", 140);
		golfClub iron6 = new golfClub("6 Iron", 150);
		golfClub iron5 = new golfClub("5 Iron", 160);
		golfClub iron4 = new golfClub("4 Iron", 170);
		golfClub iron3 = new golfClub("3 Iron", 180);
		golfClub wood3 = new golfClub("3 Wood", 200);
		golfClub driver = new golfClub("Driver", 230);
		driver.display();
		
		int temp1;
		String temp2;
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Distance: ");
		temp1 = console.nextInt();
		
		if (temp1 <= 20)
		{
			putter.display();

		}
		else if (temp1 >= 20 & temp1 <= 70)
		{
			SW.display();

		}
		else if (temp1 >= 70 & temp1 <= 90)
		{
			GW.display();

		}
		else if (temp1 >= 90 & temp1 <= 100)
		{
			PW.display();

		}
		else if (temp1 >= 100 & temp1 <= 115)
		{
			iron9.display();

		}
		else if (temp1 >= 115 & temp1 <= 130)
		{
			iron8.display();

		}
		else if (temp1 >= 130 & temp1 <= 140)
		{
			iron7.display();

		}
		else if (temp1 >= 140 & temp1 <= 150)
		{
			iron6.display();

		}
		else if (temp1 >= 150 & temp1 <= 160)
		{
			iron5.display();

		}
		else if (temp1 >= 160 & temp1 <= 170)
		{
			iron4.display();

		}
		else if (temp1 >= 170 & temp1 <= 180)
		{
			iron3.display();

		}
		else if (temp1 >= 180 & temp1 <= 200)
		{
			wood3.display();

		}
		else if (temp1 >= 200 & temp1 <= 230)
		{
			driver.display();

		}
		
		//Mine does not do the rounding down, I could use the getDistance but it is due on blackboard on 1. 
		
	}
	
	
}
