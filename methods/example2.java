public class example2 {

//Note: 
//Access modifiers: public, private, protected, default(none)
//Declarations: static, final, abstract, synchronized, native, strictfp: 
//Return value types: void, int, float, double, long, short, char, boolean, byte

    public static void main(String [] args) {
        //constructor - creates a new class instance
        example2 e = new example2();
        e.loop(); 
        }
                
             void loop() {
                    
                System.out.println("Ex 2 Instance variables loop here, Before the Loop");
                int x = 1;
                        
        
                        while (x < 4) {
                            System.out.println("Ex 2 Running a loop");
                            System.out.println("Ex 2 Value of x is " + x);
                            x = x + 1;
                        }
                        System.out.println("Ex 2 This is where values are returned, if any, after the loop");       
        
        }
        
}

