/*
 * program to calculate miles/liters and total average at the end of the journey
 */
package task2;
import java.util.Scanner;

/**
 *
 * @author abasit.bscs16seecs
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create Scanner to obtain input from command line
    Scanner input = new Scanner( System.in );
    int miles;
    int liters;
    float average=0;
    float total=0;
    float totalAverage=0;
    int count=0;
    
    do{
    System.out.print( "Enter miles travel: " ); // prompt
    miles = input.nextInt(); // read miles travel from user
    if(miles==-1){
        miles=0;
        break;
    }
    System.out.print( "Enter liters used: " ); // prompt
    liters = input.nextInt(); // read liters used from user
    average=miles/liters;
    total=total+average;//calculating average
    System.out.printf("Average is:%.2f\n",average);//printing average
    count++;
    
    }while(miles!=0);
    totalAverage=total/count;
    System.out.printf("Total Average is:%.2f\n",totalAverage);//printing total average
    }//end main
    
}//end class
