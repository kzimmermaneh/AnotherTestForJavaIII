import java.util.Scanner;
	public class EqualOrRight 
{
		public static void main(String[] args)
{
			int length1 = 0, length2 = 0, length3 = 0;
			
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Side length #1");
		int le = scan.nextInt();
		System.out.print("Side length #2");
		int len = scan.nextInt();
		System.out.print("Side length #3");
		int length = scan.nextInt();
		if (length1 == length2 && length1 == length3 && length2 == length3)
			System.out.println("Equalateral Triangle");
	
		
	
}
}