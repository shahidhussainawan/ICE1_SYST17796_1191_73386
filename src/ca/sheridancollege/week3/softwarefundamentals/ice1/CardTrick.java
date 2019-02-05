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
 * @modifer Riley Gray 991471547
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Card luckyCard=new Card();
        luckyCard.setSuit("Spades");
        luckyCard.setValue(12);
        int count=0;
        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue((int) (Math.random() * 13) + 1);
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
        }
        for(int i=0; i<magicHand.length; i++)// and search magicHand here
        {
           if(luckyCard.getValue()==magicHand[i].getValue()&&luckyCard.getSuit().equals(magicHand[i].getSuit()))
           {
               System.out.println("You Got the lucky Card");
               count++;
           }
        }
        if(count==0){
         System.out.println("Sorry no Lucky Card");   
        }
        //Then report the result here
        
    }

}
