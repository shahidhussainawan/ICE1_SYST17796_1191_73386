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
 * Jasdeep Singh Dhilon
 * student id - 991529361
 */
public class CardTrick {
    
    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
             c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[(int) (Math.random()*3 +1)]);
         
         magicHand[i]=c;   
         System.out.println("This is the Random Card Suit " + c.getSuit());
         System.out.println(" This is the Random Number " + c.getValue());
         break;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
        
          
          System.out.println("Please Enter a card ");
        String inputCard = input.nextLine();
        
        System.out.println("Please Enter a value");
      
        int inputValue = input.nextInt();
        
       
     
        Card userCard = new Card();
        userCard.setValue(inputValue);
        userCard.setSuit(inputCard);
       
        
        
    for (int i=0; i<magicHand.length; i++)
        {
            
           
            if(((magicHand[i].getSuit()).equals(userCard.getSuit()))  && (magicHand[i].getValue()==userCard.getValue()))
            {
                
                System.out.println("You Win");
                break;
   }
            else {
                
          System.out.println("You lost");
                break;
            }
    }
         Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Diamonds");
        System.out.println("Lucky Card "+luckyCard.getValue());
        System.out.println("Lucky Suite "+luckyCard.getSuit());
       
        
        
    }
    
    
}
