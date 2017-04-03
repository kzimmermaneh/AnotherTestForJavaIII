import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 1 and 6");

        Random rnd = new Random();
        
        for (int i = 1; i <= 5; ++i)
        {
          int randomInt = 5 + rnd.nextInt(90);
          System.out.println("Generated number: " + randomInt);
        }
    
        System.out.println("Done.");
    }

	private static void output(String string) {
		// TODO Auto-generated method stub
		
	}
}

