/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abasit.bscs16seecs
 */
public class Employee {
    //CREATING INSTANCE VARIABLES
    private String first_name;
    private String last_name;
    private double salary;
    
    //CREAINTG CONSTRUCTOR
    public Employee  (String fir,String las,double sal){
    first_name=fir;
    last_name=las;
    if(sal<0)
    {salary=0.0;}
    else
    {salary=sal;}
    
    }
//DECLARING METHODS
    
    
    //FIRST NAME GETTING METHOD
public String getFirstName(){
    return first_name;
}
//FIRST NAME SETTING METHOD
public void setFirstName(String fname){
    first_name=fname;
}

//LAST NAME GETTING METHOD
public String getLastName(){
    return last_name;
}

//LAST NAME SETTING METHOD
public void setLastName(String lname){
    last_name=lname;
}

//SALARY GETTING METHOD
public double getSalary(){
    return salary;
}

//SALARY SETTING METHOD
public void setSalary(double sal ){
    if(sal<0)
    {salary=0.0;}
    else
    {salary=sal;}
}


}//END CLASS
