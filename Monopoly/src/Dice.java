import java.util.Random;
import java.util.Scanner;


public class Dice {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rnd =  new Random();
		int randomRoll;
		int randomRoll2;
				
				
		for (int i = 1; i <=1; ++i);
		
	{
			randomRoll = 1 + rnd.nextInt(6);
			randomRoll2 = 1 + rnd.nextInt(6);
			System.out.println("User rolls: " + randomRoll + " and " + randomRoll2 );
			if(randomRoll == randomRoll2){
			System.out.println("Doubles!");
			System.out.println("Move " + (randomRoll + randomRoll2) + " spaces and continue rolling");
			randomRoll = 1 + rnd.nextInt(6);
			randomRoll2 = 1 + rnd.nextInt(6);
			if(randomRoll == randomRoll2)
			System.out.println("Doubles!");
			System.out.println("Move " + (randomRoll + randomRoll2) + " spaces and continue rolling");
			if(randomRoll == randomRoll2)
			System.out.println("Doubles!");
			System.out.println("Go To Jail");
			
			
				
		
			
			
			
			}
			else System.out.println("Move " + (randomRoll + randomRoll2) + " spaces and stop");
		
			}
	}
	

	}


