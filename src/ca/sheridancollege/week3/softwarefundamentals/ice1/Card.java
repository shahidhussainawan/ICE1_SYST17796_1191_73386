/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @modifier Abdulrahman Khan (monamoe) 01.02.2018
 */
public class Card {
    
   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
   
   public Card(String inputString, int inputInt){
       this.suit = inputString;
       this.value = inputInt;
   }
   public Card(){
       
   }
   
   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
   //returns the Card's Suit
    public String getSuit() {
        return this.suit;
    }

    //sets the Card's Suit
    public void setSuit() {
        this.suit = SUITS[(int)(Math.random()*4)];
    }

    //returns the Card's Value
    public int getValue() {
        return value;
    }

    //returns the Card's Value
    public void setValue() {
        this.value = (int)(Math.random()*13)+1;
    }
   
   
    
}
