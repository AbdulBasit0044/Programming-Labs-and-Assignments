/*
 * 
 */
package deal;
import java.util.Scanner;
/**
* 
*/public class Deal {
    private static void modify_deck(String [] deck)
{
int N = deck.length;
for (int i = 0; i < N; i++)
{
int r = i + (int) (Math.random() * (N - i));
String t = deck[i];
deck[i] = deck[r];
deck[r] = t;
}
}
public static void main(String[] args) {
    int N;
    // create Scanner to obtain input from command line
Scanner input = new Scanner( System.in );
N= input.nextInt(); // 

String [] suit = { "Clubs", "Diamonds", "Hearts", "Spades"};
String [] rank =
{
"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
};
String [] deck = new String [suit.length * rank.length];
for (int i = 0; i < suit.length; i++)
for (int j = 0; j < rank.length; j++)
deck [rank.length * i + j] = rank [j] + " of " + suit[i];
modify_deck(deck);
for(int i=0;i<N;i++)
{
System.out.println();}
for (int k = 0; k < (suit.length * rank.length); k++)
System.out.println(deck[k]);
}
}