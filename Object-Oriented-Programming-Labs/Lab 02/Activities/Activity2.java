/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/**
* There is a mysterious error in this program. Identify this error.
* Is this a syntax error? or a logical one.
*/public class Activity2{
public static void main(String[] args) {
int sum;
int x;
x = 1; // initialize x to 1 for counting
sum = 0; // initialize sum to 0 for totaling
System.out.println( "Going to calculate the sum" );
while ( x <= 10 ) // while x is less than or equal to 10
{
sum += x;
x++;// add x to sum
} // end while
System.out.printf( "The sum is: %d\n", sum );
}
}