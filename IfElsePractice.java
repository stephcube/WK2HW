package week2;

public class IfElsePractice {

	public static void main(String[] args) {
	
	int x = -3;
	int y = -8;
	
	if(x > 0 && y > 0)
		System.out.println("The point is in quadrant 1."); 
	else if(x < 0 && y > 0)
		System.out.println("The point is in quadrant 2.");
	else if(x < 0 && y < 0)
		System.out.println("The point is in quadrant 3.");
	else if(x > 0 && y < 0)
		System.out.println("The point is in quadrant 4.");

	
	int num = 10;
	  if(num >= 10 && num <= 99)
			System.out.println(num + " is a two digit number");  
	    else if(num > 99 && num <= 999)
			System.out.println(num + " is a three digit number"); 
		else if(num > 999 && num <= 9999)
			System.out.println(num + " is a four digit number");
		else if(num > 9999 && num <= 99999)
			System.out.println(num + " is a five digit number");
		else
			System.out.println("Your number is smaller than 10 or larger than 99999");

	int i = 20;
	if (i == 20) {
		System.out.println("i is 20");
	} else {
		System.out.println("i is not a valid option");
		
		
	
	}
	}
	}


	