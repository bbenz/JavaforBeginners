class example3 {
 
    //int a=0;
    //int b=0;

public static void main(String [] args) {
//Call the shareLoop constructor to create two new objects

shareLoop s1 = new shareLoop();
shareLoop s2 = new shareLoop();


//set the value of the shareLoop instance variables
s1.setSharey(1);
s1.shareLoop(s1.getSharey(), s1.sharez());

s2.setSharey(2);
s2.shareLoop(s2.getSharey(), s2.sharez());


//If you try to use instance variables - you get an error - Cannot make a static reference to the non-static field
//local variables or fixed values work, but have limited use
//int a=0;
//int b=0;
//shareLoop s3 = new shareLoop();
//s3.shareLoop(a,b);
//s3.shareLoop(0,0);

//public static final instance variable f = public to the class and to all instances
//it can be called here even if it is not initialized 
System.out.println("Ex 3 Value of public final (constant) f is: " + s2.f);

}
}
