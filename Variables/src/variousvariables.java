	public class variousvariables {

public static void main(String[] args) {
            //declare variables here before we use them 
                int x, y, answer; 
            //all three variables will be declared as integers 
            double temperature; 
            float Temperature;
            double GPA;
            //a float uses less memory than a double 
               String firstName, lastName; 
               String movie;
               String question = "unknown";     //question is initialized</p>
                //assign values to the variables here
               
                x = 4;
                y = 2147483647; //you could also use the constant Integer.MAX_VALUE
                answer = 4;
                firstName = "Jesse";
                lastName = " Jang";  
                movie = "Fight Club";
                // String question = "unknown"; //question is initialized
                temperature = 98.6;
                Temperature = 32.0f;
                GPA =  4.00;

                //Use the variables here
                System.out.println( "The variable x contains a value of " + x );
                System.out.print( "The value " + y + " is the largest value ");
                System.out.println( "you can store in an integer." );
                System.out.println("The anwser to the question is: " + answer );
                System.out.println("And the question has long since been " + question);
                System.out.println("If you're not sick your temperature is " 
                                                                        + temperature);
                System.out.println("If you're an ice cube your temperature is" 
                                                                        + Temperature);
                System.out.println("The variable Temperature is not "
                                                         + "the same as  temperature");
                System.out.println("My name is " + firstName  +  lastName );
                System.out.println("My favorite move is: "+ movie);
                System.out.println("My grade point average is "  +  GPA);}
}