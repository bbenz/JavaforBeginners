class shareLoop {

//Instance variables
private int sharey;
//private = private to the class
private static int sharez = 0;
//private static = private to the class and all instances
//static = initialized when the class is loaded, private to the class and all instances
public static final String f = "Loop is Done";
//final = constant (will not change)

//Getters and setters
public int getSharey() {
    return sharey; 
}

public void setSharey(int y) {
    sharey = y; 
}

//Increments the private static int sharez
//No getters and setters needed
public int sharez() {
    sharez++;
    return sharez;
}

//The called method, void because we print values, none are needed
void shareLoop(int x, int z) {
    System.out.println("Ex 3 Instance variables are now passed, not created before the Loop");
    
    //This time we passed x instead of initializing it in the method. 
    //int x = 1;
    
    System.out.println("Ex 3 Value of private int x is " + x);
    System.out.println("Ex 3 Value of private static int z is " + z);

    while (x < 4) {
        System.out.println("Ex 3 Running a loop");
        System.out.println("Ex 3 Value of x is " + x);
        x = x + 1;
    }
    System.out.println("Ex 3 This is where values are returned, if any, after the loop");
    System.out.println("Ex 3 Value of private int x is now " + x);

}

}

