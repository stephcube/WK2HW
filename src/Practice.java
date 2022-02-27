import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		


		    char grade = 'D';
			switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
			}
				
				if (5 == 5) {
					if (4 == 3) {
						System.out.println("5 is 5 and 4 is 4");
					} else { 
						System.out.println("5 is 5");}
					
					for (int i = 1; i <= 10; i++) {
						System.out.println(i);
					}
					int x = 10;
					while (x >10) {
						System.out.println(x);
						x++;
					}
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter your name: ");
					String name1 = sc.nextLine();
					
					System.out.println("Welcome, " + name1);
					
					int selection = 0;
					double total = 0;
					
					while (selection != 4){
					
					System.out.println("Select an option.");
					System.out.println("1) add candybar to shopping cart: 1.99");
					System.out.println("2) add cheese to shopping cart: 6.95");
					System.out.println("3) add soccer ball to shopping cart: 12.99");
					System.out.println("4) checkout");
					
					selection = sc.nextInt();
						
					}
					switch (selection) {
					case 1:
						total += 1.99;
						break;
					case 2:
						total += 6.95;
						break;
					case 3:
						total += 12.99;
						break;
					case 4:
						break;
						default:
							System.out.println("Please pick a valid option.");
					}
					System.out.println("Your current total is: " + total);
					
				}
				}
}



			
			

		
	
		
