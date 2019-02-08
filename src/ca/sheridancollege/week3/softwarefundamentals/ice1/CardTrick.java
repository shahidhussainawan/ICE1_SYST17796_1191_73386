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
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
     Scanner card1= new Scanner(System.in);
     System.out.println("engter number and suit");
     int number = card1.nextInt();
     String suits = card1.next();
     c.setValue(number);
     c.setSuit(suits);
     System.out.println("number is "+c.getValue() +"SUIT IS:"+c.getSuit());
     magicHand[i] = c;
        }
     System.out.println("enter card to be searched");
     Scanner card2 = new Scanner(System.in);
     Card[] card12 = new Card[1];
     int value= card2.nextInt();
     String s = card2.next();
     if(card12==magicHand){
         System.out.println("card exists");
     }
     else{
         System.out.println("doenot exist");
     }
}
}