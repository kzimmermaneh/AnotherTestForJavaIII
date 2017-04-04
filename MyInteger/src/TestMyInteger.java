
public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger M = new MyInteger(26);
	       System.out.println("MyInteger "+ M.getValue() +" is Even " + (M.isEven()?" Yes":" No"));
	       System.out.println("MyInteger "+ M.getValue() +" is Odd " + (M.isOdd()?" Yes":" No"));
	       System.out.println("MyInteger "+ M.getValue() +" is Prime " + (M.isPrime()?" Yes":" No"));
	       System.out.println("MyInteger 23 is Even " + (M.isEven(23)?" Yes":" No"));
	       System.out.println("MyInteger 15 is Odd " + (M.isOdd(15)?" Yes":" No"));
	       System.out.println("MyInteger 43 is Prime " + (M.isPrime(43)?" Yes":" No"));
	       MyInteger MP = new MyInteger(14);
	       MyInteger MQ = new MyInteger(15);
	       MyInteger MS = new MyInteger(16);
	       System.out.println("MyInteger "+ MP.getValue() +" is Even " + (M.isEven(MP)?" Yes":" No"));
	       System.out.println("MyInteger "+ MQ.getValue() +" is Odd " + (M.isOdd(MQ)?" Yes":" No"));
	       System.out.println("MyInteger "+ MS.getValue() +" is Prime " + (M.isPrime(MS)?" Yes":" No"));
	       System.out.println("MyInteger "+ MP.getValue() + " and 33 are same ? " + (MP.equals(33)));
	       System.out.println("MyInteger "+ MP.getValue() + " and "+MQ.getValue() +" are same ? " + (MP.equals(MQ)));
	       MyInteger SS = new MyInteger(10);
	       char[] array = {'1','2','3'};
	       System.out.println("SS has value " + SS.parseInt(array));
	       MyInteger SP = new MyInteger(10);
	       System.out.println("SP has value " + SP.parseInt("678"));
	   }

}
