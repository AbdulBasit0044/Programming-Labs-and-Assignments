/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;//IMPORTING PACKAGE FOR SCANNING
/**
 *
 * @author abasit.bscs16seecs
 *///CREATING EMPLOYEE CLASS FOR TESTING AND PRINTING
public class EmployeeTest {
    public static void main(String args []){
    //CREATING OBJECT FOR SCANNING
    Scanner S=new Scanner (System.in);
    //PRINTING DATA OF EMPLOYEE 1
    System.out.println("Enter Data of Employee 1:");
    System.out.println("Enter First Name:");
    String E1fname=S.next();//SCANNING FIRST NAME
    System.out.println("Enter First Name:");
    String E1lname=S.next();//SCANNING LAST NAME
    System.out.println("Enter Salary:");
    double E1sal=S.nextDouble();//SCANNING SALARY
    Employee E1=new Employee(E1fname,E1lname,E1sal);
    //PRINTING YEARLY SALARY
    System.out.println("The Yearly Salary of "+E1.getFirstName()+" "
    +E1.getLastName()+" is:");
    System.out.println(E1.getSalary()*12);
    
    
    //PRINTING DATA OF EMPLOYEE 1
    System.out.println("Enter Data of Employee 2:");
    System.out.println("Enter First Name:");
    String E2fname=S.next();//SCANNING FIRST NAME
    System.out.println("Enter First Name:");
    String E2lname=S.next();//SCANNING LAST NAME
    System.out.println("Enter Salary:");
    double E2sal=S.nextDouble();//SCANNING SALARY
    Employee E2=new Employee(E2fname,E2lname,E2sal);
    //PRINTING YEARLY SALARY
    System.out.println("The Yearly Salary of "+E2.getFirstName()+" "
    +E2.getLastName()+" is:");
    System.out.println(E2.getSalary()*12);
    
    
    
    //PRINTING SALARY WITH 10% INCREMENT
    System.out.println("*********Salaries with 10% increment *********");
    System.out.println("the new yearly salary of "+
    E1.getFirstName()+" "+E1.getLastName()+" with 10 % increment is :");
    System.out.println(E1.getSalary()*12 +(E1.getSalary()/10) );
    System.out.println("the new yearly salary of "+
    E2.getFirstName()+" "+E2.getLastName()+" with 10 % increment is :");
    System.out.println(E2.getSalary()*12 +(E2.getSalary()/10) );
    
    }//END MAIN
}//END CLASS
