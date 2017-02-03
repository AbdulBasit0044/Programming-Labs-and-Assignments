//ABDUL BASIT
//193227
/*
program to calculate the BMI of the person
 */
package task1;//package for tghe progam
import java.util.Scanner;//package for inputs
/**
 *
 * @author abasit.bscs16seecs
 */
public class Task1 {//CLASS

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input=new Scanner(System.in);
        //DECLARING VARIABLES
        float weight;
        float height;
        float BMI;
        //scanning inputs from user and giving prompt
        System.out.println("Please! Enter your weight in kg:");
        weight=input.nextFloat();
        System.out.println("Now! Enter your height in meters:");
        height=input.nextFloat();
        //calculating BMI
        BMI=weight/(height*height);
    //printing BMI with result for user
   System.out.println("Your BMI is:");
   //control structure to print the range of your BMI
    if(BMI<18.5)
        System.out.printf("UNDERWEIGHT:%.2f\n",BMI);
    if(BMI>18.5 && BMI<24.9)
        System.out.printf("NORMAL:%.2f\n",BMI);
    if(BMI>25 && BMI<29.9)
        System.out.printf("OVERWEIGHT:%.2f\n",BMI);
    if(BMI>30)
        System.out.printf("OBESE:%.2f\n",BMI);
    }//end main
}//end class
