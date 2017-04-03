
import java.util.regex.Matcher;

import java.util.regex.Pattern;
import java.util.Scanner;



public class BookApplication {

	public static void main(String[] args, String address, Object name) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name");
		String.name = input.next();
		
	
		BookApplication myBook = new Book();
		((Book) myBook).setAddress(address);
		((Book) myBook).setName((String) name);
	}

	
}