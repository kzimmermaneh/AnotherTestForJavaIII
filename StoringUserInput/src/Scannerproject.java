import java.util.Scanner;
public class Scannerproject
{
	 public static void main(String[] args){
		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("Enter your first intial, last name, house #, street name, street type, and city:");
		 //String (variable) = keyboard.next() creates each new input
		 String firstInitial = keyboard.next();
		String lastName = keyboard.next();
		String houseNumber = keyboard.next();
		String streetName = keyboard.next();
		String streetType = keyboard.next();
		String city = keyboard.next();
		//
				
		 
		 
		 System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		 
		 System.out.println(streetName + " " + streetType + " " + city);
		 
		 

	 }
}
	
