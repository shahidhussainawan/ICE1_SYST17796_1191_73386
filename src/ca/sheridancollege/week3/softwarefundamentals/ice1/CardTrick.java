
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Shaimaa Ali
 * @modifiedby Gundeep Singh , 991530217
 * 
 */
public class CardTrick {
    
    public static void main(String[] args){
            Scanner in=new Scanner(System.in);
    
        Card[] magicHand = new Card[7];
        
           
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            c.setValue((int)(Math.random()*13+1));
            magicHand[i]=c;
        }
        System.out.println("Enter any Suit:Hearts, Diamonds,Spades,Clubs");
        String s=in.nextLine();
        System.out.println("Enter Card number");
        int v=in.nextInt();
        Card userCard=new Card();
        userCard.setValue(v);
        userCard.setSuit(s);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        for (int i=0;i<magicHand.length;i++) {
            if ((magicHand[i].getSuit() == userCard.getSuit()) && (magicHand[i].getValue() == userCard.getValue())) {
                System.out.println("Same card");
                break;
            } else {
                System.out.println("Not Same");
                break;
            }
        }
           
        Card luckyCard=new Card();
            luckyCard.setValue(9);
            luckyCard.setSuit("Diamonds");
            System.out.println("Lucky card is: ");
            System.out.println(luckyCard.getValue());
            System.out.println(luckyCard.getSuit());
        
            
    }
    
}
