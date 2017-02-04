/*
 * ABDUL BASIT
   193227
*/
import java.util.Scanner;
/**
 *
 * @author abasit.bscs16seecs
 */
public class DateTest {
    public static void main(String [] args){
        //CREATING OBJECT FOR SCANNING
 Scanner S = new Scanner(System.in);
 
 System.out.print("Enter year: ");
 int year = S.nextInt();//SCANNING YEAR
 
 System.out.print("Enter month: ");
 int month = S.nextInt();//SCANNING MONTH
 
 System.out.print("Enter day: ");
 int day = S.nextInt();//SCANNING DAY
 
 Date date = new Date(year, month, day);
 
 System.out.print("You Entered :");
 //PRINTING DATE USING METHOD FROM DATE CLASS
 date.displayDate();
 
 }//END MAIN
}//END CLASS

