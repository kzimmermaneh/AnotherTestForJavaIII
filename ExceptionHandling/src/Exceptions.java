import java.util.Scanner;

public class Exceptions {
  public static void main(String[] args) {
	  
try{	
 
  int a, b;
  int result = 0;
  //String c = "";
  //String d="";
 
  Scanner input = new Scanner(System.in);
  Scanner newScan = new Scanner(System.in);
  
  
  
  System.out.println ("Enter a 3 digit number: ");
  String line = newScan.nextLine ();
  
  int digit =0;
 // System.out.println("Input two integers");
  while (true) {
      if (line.length () == 3) {
          try {
              result = Integer.parseInt (line);
              break;
          }
          catch (NumberFormatException e) {
              System.out.println("This is not a 3 digit number!");
          }
      }

      System.out.println ("Error!(" + line + ") Please enter a 3 digit number: ");
      line = newScan.nextLine ();
  }

  System.out.println (digit);

  
  
  
  
  //catch using Arithmetic Exception
 // c = newScan.nextLine ();
 // d = newScan.nextLine(); 
  
  a=input.nextInt();
  b=input.nextInt();
  result = a/b;
  
  
  
  
  
  
  
  
  
  while ( result!= 3)
	{
		System.out.println("Result =" + result);
	}
  }catch (ArithmeticException s){

           System.out.println("What's the problem?" + s);
  }
	  
  catch (NumberFormatException e) {
	      
	      System.out.println("Now what?" + e);


  }

System.out.println("No problem here!");
  }
}



