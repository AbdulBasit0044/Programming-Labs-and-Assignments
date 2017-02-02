/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/**
* There is a mysterious error in this program. Identify this error.
* Is this a syntax error? or a logical one.
*/public class Cards {
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
for (int k = 0; k < (suit.length * rank.length); k++)
System.out.println(deck[k]);
}
}