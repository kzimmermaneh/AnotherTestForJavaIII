
public class Fan {

	
	private static final int slow = 1;
	private static final int medium = 2;
	private static  final int fast = 3;
	
	
	private int speed = 1;
    private boolean onAndoff = false;
    private double radius = 5;
    private String color = "blue";
 
    public Fan() {
        this.speed = speed;
        this.onAndoff = onAndoff;
        this.radius = radius;
        this.color = color;
    }
 
   public void setSpeed(int speed) {
        this.speed = speed;
    }
 
  public  void setOnAndOff(boolean open) {
        this.onAndoff = open;
    }
 
  public  void setRadius(double radius) {
        this.radius = radius;
    }
 
  public  void setColor(String color) {
        this.color = color;
    }
 
  public int getSpeed() {
        return this.speed;
    }
 
  public  boolean isOnAndOff() {
        return this.onAndoff;
    }
 
  public  double getRadius() {
        return this.radius;
    }
 
   public String getColor() {
        return this.color;
    }
 
   
   public String toString(){
	   
       Fan fan = new Fan();
       String printfan = null;

       if(fan.onAndoff == true){
           printfan = ("Speed: " + fan.getSpeed() + " Color: " + fan.color + " Radius: " + fan.radius);
       }
       if(fan.onAndoff == false){
           printfan = ("Color: " + fan.color + " Radius: " + fan.radius + " Fan is not on");
       }
       return(printfan);
   }
   
   
   
   
   
}
	
	
	

