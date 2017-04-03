import java.util.Scanner;
public class TestScores
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		

System.out.print("Enter your test score: ");
		int score = scan.nextInt();
		char grade = 'F';//I'm not hopeful

		if (score >= 97 && score <= 100 )
			System.out.println("A+");
		else if (score >= 93 && score < 97)
			System.out.println("A");
		else if (score >= 89 && score < 93)
			System.out.println("A-");
		else if (score >= 87 && score < 89)
			System.out.println("B+");
		else if (score >= 83 && score < 87)
			System.out.println("B");
		else if (score >= 79 && score < 83)
			System.out.println("B-");
		else if (score >= 77 && score < 79)
	    	System.out.println("C+");
		else if (score >= 73 && score < 87)
	    	System.out.println("C");
		else if (score >= 69 && score < 73)
		    System.out.println("C-");
		else if (score >= 67 && score < 69)
	    	System.out.println("D+");
		else if (score >= 63 && score <67)
			System.out.println("D");
		else if (score >= 60 && score < 63)
			System.out.println("D-");
		else if (score >= 60)
			System.out.println("F");
		    grade = 'F';

		if (score > 69)
		    System.out.println("Very good! You don't have to retake the exam!");
		else
		    System.out.println("Did you even look at the book?");
	}
}
 