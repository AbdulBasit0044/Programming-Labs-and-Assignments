/*
 * ABDUL BASIT
   193227
 */

/**
 *
 * @author abasit.bscs16seecs
 */
public class Date {
 //CREATING INSTANCE VARIABLES
 private int year;
 private int month;
 private int day;
 
 //CREATING CONSTRUCTOR
 public Date(int y , int m , int d){
 if(y>=0)
 year = y;
 else year = 2000;
 if(m>0 && m<=12)
 month = m;
 else month = 1;
 if(d>0 && d<=30)
 day = d;
 else day = 1;
 }
 
 
 //GETTING YEAR METHOD
 public int getYear(){
 return year;
 }
 
 //SETTING YEAR METHOD
 public void setYear(int y){
 if(y>=0)
 year = y;
 else year = 2000;
 }
 
 //GETTING MONTH METHOD
 public int getMonth(){
 return month;
 }
 
 //SETTING MONTH METHOD
 public void setMonth(int m){
 if(m>0 && m<=12)
 month = m;
 else month = 1;
 }
 
 //GETTING DAY METHOD
 public int getDay(){
 return day;
 }
 
 //SETTING DAY METHOD
 public void setDay(int d){
 if(d>0 && d<=30)
 day = d;
 else day = 1;
 }
 
 //DISPLAYING DATE METHOD
 public void displayDate(){
 System.out.println(day+"/"+month+"/"+year);
 }

}
