/*
 * ABDUL BASIT
   193227
 */

/**
 *
 * @author abasit.bscs16seecs
 *///RECTANGLETEST CLASS FOR TESTING
public class RectangleTest {
    
    //MAIN FUNCTION
    public static void main(String args[]){
    
    //DECLARING AND CREATING OBJECTS WITH RECTANGLE CLASS
    Rectangle O1=new Rectangle(4.0,40.0);
    Rectangle O2=new Rectangle(3.5,35.9);
    
    //PRINTING DATA OF OBJECT 1
    System.out.printf("Object 1 with width=%.02f and height=%.02f\n",O1.width,O1.height);
    System.out.printf("Width=%.02f\n", O1.width);//PRINTING WIDTH
    System.out.printf("Height=%.02f\n", O1.height);//PRINTING HEIGHT
    System.out.printf("Area=%.02f\n", O1.getArea());//PRINTING AREA
    System.out.printf("Parameter=%.02f\n", O1.getPerimeter());//PRINTING PERIMETER
    

    //PRINTING DATA OF OBJECT 2
    System.out.printf("Object 2 with width=%.02f and height=%.02f\n",O2.width,O2.height);
    System.out.printf("Width=%.02f\n", O2.width);//PRINTING WIDTH
    System.out.printf("Height=%.02f\n", O2.height);//PRINTING HEIGHT
    System.out.printf("Area=%.02f\n", O2.getArea());//PRINTING AREA
    System.out.printf("Parameter=%.02f\n", O2.getPerimeter());//PRINTING PERIMETER

    }//END MAIN
}//END CLASS
