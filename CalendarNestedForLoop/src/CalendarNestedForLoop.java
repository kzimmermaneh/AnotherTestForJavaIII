import java.util.*;
public class CalendarNestedForLoop {
	
	private static final String DEFAULT = null;

	public static void main(String[] args) 
	{
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = keyboard.nextInt();
		month = month -1;
		System.out.println("Enter the year");
		int year = keyboard.nextInt();
		
		
		
	

		String Months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};
		int Days []= {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//create a Gregorian calendar with a particular date
		//Year must be a four digit integer
		//Month is an integer from 0 to 11
		//Day must be an integer from 1 to 31
		GregorianCalendar gc = new GregorianCalendar(year, month, 1);
		System.out.println("Year:" + gc.get(Calendar.YEAR));
		//show the month from the array
		System.out.println("Month:" + gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
	
		
		
		System.out.print("\t" + year);
		System.out.print("\t" + Months[month] + "\n");
		int d = gc.get(Calendar.DAY_OF_WEEK);
		
		
		System.out.printf("%3s %3s %3s %3s %3s %3s %3s \n", 'S' , 'M', 'T', 'W', 'T', 'F', 'S');
	//	System.out.printf("\033[0;1m %3s %3s %3s %3s %3s %3s %3s \n",'S' , 'M', 'T', 'W', 'T', 'F', 'S'  + textInBold);
		d=d-1;
		for (int i=0; i<d; i++){
			System.out.print("    ");}
		
		for (int j=1; j<=Days[month]; j++) {
			System.out.printf(" %2d ", j);
			if ((j+d)% 7==0 || j== Days[month]) {
				System.out.println();
			}
			}
		}
		
		
}
	





