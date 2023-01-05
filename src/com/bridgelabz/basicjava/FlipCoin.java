package com.bridgelabz.basicjava;

public class FlipCoin {

	public static void main(String[] args) { 
	       
		double num=(Math.random());
        
    	if (Math.random() < 0.5){   //To check value less than 0.5 or not
    		
    		//print the string Heads otherwise prints Tails
        System.out.println("Heads");
            }
    	
    	else {
         System.out.println("Tails");
            }
    	
    	//printing out percentage of turnout
    	System.out.println("Percentage of turnout Coin is "+ num*100 +"%");
     }


}