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
 * @modifier Ayodeji date: 2/7/2019 
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) Math.round(Math.random() * 12) + 1);
            c.setSuit(Card.SUITS[(int) Math.round(Math.random() * 3)]);

            magicHand[i] = c;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter card value:");
        int cardValue = input.nextInt();

        System.out.println("Enter card suit:");
        int cardSuit = input.nextInt();

        Card card = new Card();
        card.setValue(cardValue);
        card.setSuit(Card.SUITS[cardSuit]);
        
       Card luckycard=new card();
        luckycard.setValue(5);
        luckycard.setSuit(Card.SUITS[0]);

       // System.out.println("user card: " + card);//to print user card

        for (int a = 0; a < magicHand.length; a++) {
            if (magicHand[a].getValue() == card.getValue()) {
                if (magicHand[a].getSuit().equals(card.getSuit())) {
                    System.out.println("Found it");
                    break;
                } else {
                    System.out.println("Not found");
                    break;
                }
            } else {
                System.out.println("not found");
                break;
            }

        }

//        for (Card aCard : magicHand) {
//            System.out.println("magic hand: " + aCard);
//
//        }//to prit all the cards not useful for here

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
