/*
 * Class CMSC201
 * Instructor:  Dr. Grinberg
 * This project, MyInteger, tests to see if an int is odd, even, prime, etc.
 * IDE:  Eclipse
 * Due:  11/08/15
 * I pledge by honor I have completed the programming assignment independently.
 * I have not copied the code from a student or any other source.  I have, however, referred
 * to several sources online as well as the textbook for assistance on the most straightforward approach.
 * I have not given my code to any student.
 * Sign here:  Kelly Zimmerman
 */



class MyInteger{
private int value; 

public MyInteger(int v){
value = v;
}

public int getValue() {
    return value;
}
//methods isEven(), isOdd(), and isPrime() return true if the value in this object is even, odd, or prime
public boolean isEven(){
return value%2==0;
}
public boolean isOdd(){
return value%2!=0;
}
public boolean isPrime(){
    boolean is_prime = true;
   for(int i=2; i*i<=value; i++){
       if(value % i==0){
       is_prime = false;
       break;
       }
   }
   return is_prime;
}
//static methods isEven(int), isOdd(int), and isPrime(int) return true if the value is even, odd, or prime
public static boolean isEven(int value){
return value%2==0;
}
public static boolean isOdd(int value){
return value%2!=0;
}
public static boolean isPrime(int value){
   boolean is_prime = true;
   for(int i=2; i*i<=value; i++){
       if(value % i==0){
       is_prime = false;
       break;
       }
   }
   return is_prime;
}
//The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd,pime
public static boolean isEven(MyInteger M){
   return M.isEven();
}
public static boolean isOdd(MyInteger M){
   return M.isOdd();
}
public static boolean isPrime(MyInteger M){
   return M.isPrime();
}
//The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.
public boolean equals(int v){
   return value == v;
}
public boolean equals(MyInteger M){
   return value == M.value;
}
//converts an array of numeric characters to an int value.
public static int parseInt(char[] array){
   int value = 0;
   for(int i=0; i<array.length; i++){
       value = value*10 + (int)(array[i]-'0');
   }
    return value;
}
// converts a string into an int value.
public static int parseInt(String S){
   int value = 0;
   for(int i=0; i<S.length(); i++){
       value = value*10 + (int)(S.charAt(i)-'0');
   }
    return value;
}
}

