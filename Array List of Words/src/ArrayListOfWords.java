
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListOfWords {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word or phrase");
		
		        //create an array list of type string
				//when you specify the type like you have below (in the <>'s)you are using Generics
				//When you take an element out of a Collection, 
				//you must cast it to the type of element that is stored in the collection. 
				//Besides being inconvenient, this is unsafe. 
				//The compiler does not check that your cast is the same as the collection's type, 
				//so the cast can fail at run time.
				//Generics provides a way for you to communicate the type 
				//of a collection to the compiler, so that it can be checked. 
				//Once the compiler knows the element type of the collection, 
				//the compiler can check that you have used the collection 
				//consistently and can insert the correct casts on values 
				//being taken out of the collection.
				ArrayList<String> words = new ArrayList<String>();
				
				
				//get a filename
				System.out.println((System.getProperty("user.dir") + File.separatorChar +"linuxwords.txt"));
			    String filename = (System.getProperty("c:\\downloads\\linuxwords.txt") + File.separatorChar +"linuxwords.txt");
				System.out.println(Paths.get("c:\\downloads\\linuxwords.txt"));
				
						
				
				//write file
				//Data can be output to a text file using the class PrintWriter
				//This class includes the methods print and println that you have
				//already used for terminal output
				//A PrintWriter is opened like a Scanner
				//you must handle the FileNotFound Exception
				PrintWriter writer;
				try {
					writer = new PrintWriter(new File(filename));
					for (Integer i = 0; i < 20; i++)
					{
						writer.println("Book " + i.toString());
					}
				//you must close the PrintWriter
				writer.close();
				
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				ArrayList<String> word;
				try {
					System.out.println("Read in word or phrase");
					word = (ArrayList<String>) readLines(new File(filename));
					for(String word1:words)
					{
						System.out.println(word1.toString());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
	}

	private static Object readLines(File file) {
		// TODO Auto-generated method stub
		return null;
	}

}


/**We're going to look for a word to see if it is in the UNIX dictionary. Words is a standard file on all UNIX and Linix computers. It is a newline-delimited list of dictionary words. It is often used by spell-checking programs.

The words file is usually stored in /usr/share/dict/words or /usr/dict/words.
If you're using a UNIX or Linux computer then you can refer to the file on your local machine. If you need the file, download it from the following link: https://users.cs.duke.edu/~ola/ap/linuxwords.

Get the words file on your computer. Next create a program that will prompt the user for a word or phrase. If the user enters a phrase then you will use String.split() to return an array of the words in the phrase.

String stringToSplit = "This is my string";
String delim = ' ';
String[] parts = stringToSplit.split(delim);
You will next check each word the user entered and find any that are misspelled. Create a method that takes a word and returns t/f if it exists in the dictionary (is spelled correctly).

If the user misspelled the word then tell them it is misspelled.

User enters: I really love this Java klass

Program returns: klass is not a word. Please reenter.

 Also, use Unit Testing to verify that your program works.

Bonus: If the user types list as their phrase then list all the misspelled words entered by the user.**/



