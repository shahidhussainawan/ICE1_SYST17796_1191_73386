/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifer Riley Gray 2019-02-01
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner data = new Scanner(System.in);
        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue((int) (Math.random() * 13) + 1);
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
        }
         for(int i=0; i<magicHand.length; i++)// and search magicHand here
        {
                    System.out.println(magicHand[i].getValue()+" of " + magicHand[i].getSuit());

        }
        System.out.println("Enter a card value from 1-13");
        int value = data.nextInt();
        data.nextLine();
        System.out.println("Enter a card suit (Hearts, Spades, Clubs or Diamonds)");//insert code to ask the user for Card value and suit, create their card
        String suit= data.nextLine();
        for(int i=0; i<magicHand.length; i++)// and search magicHand here
        {
           if(value==magicHand[i].getValue()&&suit.equals(magicHand[i].getSuit()))
           {
               System.out.println("match");
           }
            
        }
        //Then report the result here
    }

}
