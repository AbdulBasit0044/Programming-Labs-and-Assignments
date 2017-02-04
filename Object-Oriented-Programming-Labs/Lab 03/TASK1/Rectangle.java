/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abasit.bscs16seecs
 *///CREATING RECTANGLE CLASS
public class Rectangle {
    
    //DATA FIELDS    
    double width=1.0;
    double height=1.0;
    
    //NO ARGS CONSTRUCTOR
    Rectangle (){
    }
    
    // COSTRUCTOR THAT CREATES RECTANGLE
    Rectangle (double wid,double hei){
    height=hei;
    width=wid;
    }
    //GET AREA METHOD
    public double getArea(){

    return height*width; 
    }
    
    //GET PERIMETER METHOD
    public double getPerimeter(){
    return 2*(width+height);
    }   
}