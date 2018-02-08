package w4d2StudyHall;

import java.util.Scanner;

public class W4D2StudyHallExercise {
	/* Replace this line with a proper header which includes your name */


    private static String usersName;
    private static String inputFromUser;
    private static char menuCharacter;
       
       
	public static void main(String args[]) {
		/* Initialize the Text Hangman game */
		 System.out.println("welcome!");
		Scanner keyboard = new Scanner(System.in);
	
		   
		   System.out.println("please enter your name");  
		   String usersName=keyboard.next();  
		   /* Welcome the user and request the user to enter a name */

		   System.out.println("your enterd name is:"+ usersName);
		   /* Read in the user's name */

           while (true) {
                           /* Display menu */
		   System.out.println(usersName+"  please enter a command letter by return");
           System.out.println("P-> Play the game");
           System.out.println("s-> View statisitics");
           System.out.println("q-> Quit");

           /* Read the menu character */          

           /* Play the game? */
           menuCharacter = keyboard.next().charAt(0);
           if (menuCharacter == 'p') {

         
           System.out.println("Play the game command recognized");
           System.out.println(usersName+"  please enter a command letter followed by a return! ");
           System.out.println("P-> Play the game");
           System.out.println("s-> View statisitics");
           System.out.println("q-> Quit");

          
           }
           else if (menuCharacter == 's')
           {
                           System.out.println("View the statistics command recognized.");
                           System.out.println( usersName+"  please enter a command letter followed by a return!");

                           System.out.println("P-> Play the game");
                           System.out.println("s-> View statisitics");
                           System.out.println("q-> Quit");
                           menuCharacter = keyboard.next().charAt(0);
           }
           else if (menuCharacter == 'q')
           {
                           System.out.println("Quit the game command recodnized");
                           System.out.println("Thanks for plaiyng  "+usersName);
           }
           else
           {
                           System.out.println("*** Error *** ");
                           System.out.println("Invalid menu item entered.  It must be p, s, or q! ");
                           System.out.println("The input found was:" + menuCharacter );
                           System.out.println(usersName+" please enter a command letter followed by a return! ");
                           System.out.println("P-> Play the game");
                           System.out.println("s-> View statisitics");
                           System.out.println("q-> Quit");
           }
		  
			/* Read the menu character */

			/* Play the game? */

			/* View the statistics? */

			/* Quit the game? */

			/* Display error (if command is none of the above) */
			
		}
	}
}

