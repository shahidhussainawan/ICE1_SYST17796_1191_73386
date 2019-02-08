/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;

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
        Random r = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r.nextInt (13) + 1);
            c.setSuit(Card.SUITS[r.nextInt(3)]);
           magicHand[i]=c;
            
        }
        Scanner k = new Scanner(System.in);
        System.out.println("Enter Card Value: ");
        int cardValue = k.nextInt();
        
        System.out.println("Enter card suit: ");
        int cardSuit = k.nextInt();
        
       Card luckyCard = new Card();
       luckyCard.setValue(10);
       luckyCard.setSuit("HEART");
       
       for(int i=0; i<magicHand.length; i++){
           if (magicHand[i].getSuit().equals(luckyCard.getSuit()) &&
                    magicHand[i].getValue() == luckyCard.getValue()){
               System.out.println("Card not found");
           }else{
               System.out.println("Card not found");
           }
           
          //  if (magicHand[i].getSuit() == luckyCard.getSuit())){
           
       }
          
       }
    }
    

