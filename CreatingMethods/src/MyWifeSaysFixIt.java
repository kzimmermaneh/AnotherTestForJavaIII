 public class MyWifeSaysFixIt {

 public static void main(String[] args) 
{
    boolean isFixed = false;

    // once callPlumber executes, ifFixed doesn't care what happens in
    // the method... it just wants a return value.
    isFixed = callPlumber();

    if (isFixed)
    {
        System.out.println("My wife is happy. The drain is fixed.");
    }else{
        System.out.println("I'm in the doghouse. The drain is leaking.");
    }

}
private static boolean callPlumber()
{
    // Some code here where plumber does his thing - I don't even
    // know what he does because I don't have to pay attention
    // I just call him and pay him.

    return true;
}
}