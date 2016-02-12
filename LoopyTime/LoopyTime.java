/*
This is playing around with Loops 

*/
package loopytime;

/**
 *Yes I am to blame
 * @author ken.wagner
 */
public class LoopyTime {
    
    public static void version1WhileLoop(){
        int x = 0;
        while(x < 5) {
         System.out.println("Guess what? The value of x i " + x);
         x++; //same as x=x+1
        }
    }

    public static void version1DoWhileLoop(){
        int x = 0; 
        do { 
            System.out.println("In the Do While loop x is " + x);
            x++;
            
        } while (x < 10);
    }
    
    public static void version1ForLoop() {
        for (int x = 0; x < 20; x++){
            System.out.println( "In the For Loop, x = " + x );
           /* if (x==12){
                break;
            }*/
        }
    }
    
    public static void version2ForLoop() {
                String s1= "Java";
                int x= 100;
            
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                System.out.printf("%-15s%03d%n", s1, x);
                //Complete this line
            }
            System.out.println("================================");
    }
    
    
    
    public static void version3ForLoop(){
        for (int x = 0; x < 10; x++){
            for (int y = 0; y < 10; y++){
                System.out.println("("+x+","+y+")");
            }
    }
    }

    

public static void main(String[] args) {
        // TODO code application logic here
        version1WhileLoop();
        version1DoWhileLoop();
        version1ForLoop();
        version2ForLoop();
        version3ForLoop();
    }
    
}
