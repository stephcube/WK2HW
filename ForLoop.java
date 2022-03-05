package week2;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int x = 0;
        
        if (x > 0) {
         for (int i = 0; i <= x; i++) {
                System.out.println(i);
           
           }
                 
         } else
        	 System.out.println("Pick again");

    	String userWord = "String";
		int wordLength = 6;
		int counter = wordLength;
		
	
	        
			do {
			    System.out.println(userWord);
			    if ( wordLength < 5 ) {
			        break;
			    } 
			    counter--;
			} while ( counter > 0 );
	        }
}

		



	
		
	
