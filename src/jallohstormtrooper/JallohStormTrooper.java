
package jallohstormtrooper;
import java.lang.Math.*;
import java.util.Arrays;
/**
 *
 * @author cello
 */
public class JallohStormTrooper {
    

    // print the X axis line
    public static void stX(){
        for(int i=1; 10>= i; i++){
            System.out.print("\tst:"+i);
        }
        System.out.print("\tTOTAL DISTANCE");
    }
    
    // calculate  distance
    public static double distance(double[] pointX, double[] pointY){
        double num1 = pointX[0] - pointY[0];
        double num2 = pointX[1] - pointY[1];
        //System.out.println( + pointX[0] +" "+pointX[1]);
        //System.out.println( pointY[0] +" "+pointY[1]);
        double addNum = (Math.pow(num1, 2) + Math.pow(num2, 2));
        return Math.sqrt(addNum);
    }
    
    // display each pointX distance to an other points(Y)
    public static void displayMapData(double[][] stormLoc, String name){
        System.out.println("_______________________________________" +"STORMTROOPER DISPLAY DATA" + 
                "_______________________________________");
        stX();
        double num =0;
        int count = 0;
        int n; int m;
        int len = stormLoc.length;
        
        int start=1;
        for( n=0; len>n;n++){
          System.out.print("\nst:"+ start);
          double total =0;
            for( m=0; len >m; m++){                
                num = distance(stormLoc[n], stormLoc[m]);              
                System.out.print("\t" +String.format("%.2f", num) );
                total = total +num;
                count += 1;
                if( count == 10){ 
                   System.out.print("\t"+ String.format("%.2f", total));
                   count = 0;
                }
           }  
            start +=1;
       }
        System.out.print("\nREPORT DATA CREATED BY " + name + 
               "__________________________________\n");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Saylu Jalloh";
        double[][] array =  {
        {32, 16}, {32, 14}, {33, 13}, {35, 13}, {36, 13}, {37, 15},{36, 16},{35, 16.5},{34, 15},{33, 16}            
        };
        
        displayMapData(array, name);
    }
    
}
