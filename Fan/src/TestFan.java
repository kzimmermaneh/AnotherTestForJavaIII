/*
 * Class CMSC201
 * Instructor:  Dr. Grinberg
 * This project, Fan, creates 2 fan objects and displays radius, color, state, and speed
 * IDE:  Eclipse
 * Due:  11/08/15
 * I pledge by honor I have completed the programming assignment independently.
 * I have not copied the code from a student or any other source.  I have, however, referred
 * to several sources online as well as the textbook for the most straightforward approach.
 * I have not given my code to any student.
 * Sign here:  Kelly Zimmerman
 */
public class TestFan {

	public static void main(String[] args) {
		    Fan fan = new Fan ();
	   //     fan.setSpeed (fan.fast);
	        fan.setRadius (10);
	        fan.setColor ("yellow");
	        fan.setOnAndOff (true);
	        System.out.println (fan.toString ());
	 
	        Fan fan2 = new Fan ();
	      //  fan2.setSpeed (fan.medium);
	        fan2.setRadius (5);
	        fan2.setColor ("blue");
	        fan2.setOnAndOff (false);
	        System.out.println (fan2.toString ());

	}

}
