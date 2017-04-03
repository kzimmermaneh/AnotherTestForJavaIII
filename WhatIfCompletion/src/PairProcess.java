import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
	 double num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextDouble();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextDouble();
		
		if ((num1 + num2) < 1000)
			System.out.print(num1 + num2 + "~,") ;
		else 
			System.out.print(num1 + num2 + ",");
		
		
		
		System.out.print(num1 * num2 + ",");
		System.out.print((num1 + num2) / 2);
		
	}
}