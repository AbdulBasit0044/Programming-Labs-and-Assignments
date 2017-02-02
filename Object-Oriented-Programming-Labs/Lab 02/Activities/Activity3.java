/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/**
* There is a mysterious error in this program. Identify this error.
* Is this a syntax error? or a logical one.
*/public class Activity3{
public static void main( String[] args )
{
int y;
int x = 1;
int total = 0;
while ( x <= 10 )
{
y = x * x;
System.out.println( y );
total += y;
++x;
} // end while
System.out.printf( "Total is %d\n", total );
} // end main
} // end class Mystery