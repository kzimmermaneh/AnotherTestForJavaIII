import java.util.Scanner;

public class SomethingAboutYou { public static void main( String[] args ) { Scanner sc = new Scanner(System.in);

    String firstName;
    int age = 0;
    String height;
    double gpa;

    System.out.print( "What is your first name? " );
    firstName = sc.next();

    System.out.print( "How old are you? " );
    age = sc.nextInt();

    System.out.print( "How tall are you? " );
    height = sc.next();

    System.out.print( "What is your GPA? " );
    gpa = sc.nextDouble();
System.out.println( "Your name is " + firstName + ". You are " + age + " years old. You are " + height + " and your GPA is " + gpa);
    }
}

