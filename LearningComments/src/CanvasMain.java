    
/*
 * CanvasMain
*Jesse Jang
*March 1st 2017
*/
import java.util.Random;
import java.util.Scanner;
public class CanvasMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Comment #1
        Random random = new Random();
        int from = 1;
        int to = 100;
        int randomNumber = random.nextInt(to - from + 1) + from;
        //Comment #2
        int guessedNumber = 0;
 
        //Comment #3
        System.out.printf("The number is between %d and %d.\n", from, to);
        
        //Comment #4
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
} 