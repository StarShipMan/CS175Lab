import java.util.Arrays;
import java.util.Random;

public class CardGameVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myHand = new int[5]; 
		int [] yourHand = new int[5];
		int lowest = 0;
		int myHearts = 0;
		int myDiamonds = 0;
		int myClubs = 0;
		int mySpades = 0;
		int myCounter = 0;
		int myTurn = 0;
		int myCardMin = 0;
		int myCardMax =0;
		int yourHearts = 0;
		int yourDiamonds = 0;
		int yourClubs = 0;
		int yourSpades = 0;
		int yourCounter = 0;
		int yourTurn = 0;
		int yourCardMin =0;
		int yourCardMax = 0;
		String stringMyHand = "";
		String stringYourHand ="";
		String mySuit = "";
		String yourSuit = "";
		String gameWinner ="";
		Random generator = new Random();
		int card = 0;
		boolean noDuplicatesCheck = false;
		System.out.print("My hand is ");
		for (int i = 0; i < 5; i++)
		{
			card = 1 + generator.nextInt(52);
			myHand[i] = card;			
		}//for
		for (int x = 0; x < myHand.length; x++){
			for(int y= x; y < myHand.length; y++) {
				if (myHand[x]  > myHand[y]) {
					lowest = myHand[x];
					myHand[x] = myHand[y];
					myHand[y] = lowest;
					
				}//if
				
			}//for
		}//for
		while (noDuplicatesCheck == false) {
			for (int x = 1; x < myHand.length; x++) {
				if (myHand[x-1] == myHand[x])
					myHand[x-1] =  1 + generator.nextInt(52); 
				else
					noDuplicatesCheck = true;
			}//for
		}//while
		noDuplicatesCheck = false;
		for (int x = 0; x < myHand.length; x++){
			for(int y= x; y < myHand.length; y++) {
				if (myHand[x]  > myHand[y]) {
					lowest = myHand[x];
					myHand[x] = myHand[y];
					myHand[y] = lowest;
					
				}//if
				
			}//for
		}//for
		stringMyHand = Arrays.toString(myHand);
		System.out.print(stringMyHand);	
		System.out.println();
		System.out.print("My suit is ");
		for (int i = 0; i < myHand.length; i++)
		{
			if (myHand[i] < 14)
				myHearts++;
			else if (myHand[i]<27)
				myDiamonds++;
			else if (myHand[i]<40)
				myClubs++;
			else
				mySpades++;
			if (myHearts >= myClubs && myHearts >= myDiamonds && myHearts >= mySpades) {
				mySuit = "hearts.";
				myCounter = myHearts;
				myCardMin = 1;
				myCardMax = 13;
			}//if
			else if (myClubs > myHearts && myClubs > myDiamonds && myClubs> mySpades) {
				mySuit = "clubs.";
				myCounter = myClubs;
				myCardMin = 14;
				myCardMax = 26;
			}//else if
			else if (myDiamonds > myClubs && myDiamonds > myHearts && myDiamonds > mySpades) {
				mySuit = "diamonds.";
				myCounter = myDiamonds;
				myCardMin = 27;
				myCardMax = 39;
			}//else if
			else if (mySpades > myClubs && mySpades > myDiamonds && mySpades > myHearts) {
				mySuit = "spades.";
				myCounter = mySpades;
				myCardMin = 40;
				myCardMax = 52;
			}//else if
		}//for
		System.out.println(mySuit);
		System.out.println("I have " + myCounter + " " + mySuit);
		
		
		System.out.print("Your hand is ");
		for (int i = 0; i < 5; i++)
		{
			card = 1 + generator.nextInt(52);
			yourHand[i] = card;
			
		}//for
		for (int x = 0; x < yourHand.length; x++){
			for(int y= x; y < yourHand.length; y++) {
				if (yourHand[x]  > yourHand[y]) {
					lowest = yourHand[x];
					yourHand[x] = yourHand[y];
					yourHand[y] = lowest;
				}//if	
				
			}//for
		}//for
		while (noDuplicatesCheck == false) {
			for (int x = 0; x < yourHand.length; x++) {
				for (int y=1; y< myHand.length; y++) {
					if (yourHand[y]==myHand[x]) 
						yourHand[y] = 1 + generator.nextInt(52); 
					else if (yourHand[y-1]==myHand[y])
						yourHand[y] = 1 + generator.nextInt(52);
					else if (yourHand[y]==myHand[y-1])
						yourHand[y] = 1 + generator.nextInt(52);
					else if (yourHand[y]==yourHand[y-1])
						yourHand[y] = 1 + generator.nextInt(52);
				}//for
		
			}//for
			for (int x = 0; x < yourHand.length; x++){
				for(int y= x; y < yourHand.length; y++) {
					if (yourHand[x]  > yourHand[y]) {
						lowest = yourHand[x];
						yourHand[x] = yourHand[y];
						yourHand[y] = lowest;
					}//if	
					
				}//for
			}//for
			for (int x = 0; x<yourHand.length; x++) {
				if (yourHand[x]==myHand[x])
					yourHand[x] = 1 + generator.nextInt(52);
				else
					noDuplicatesCheck = true;
			}
				
		}//while
		noDuplicatesCheck = false;
		stringYourHand = Arrays.toString(yourHand);
		System.out.print(stringYourHand);	
		for (int i = 0; i < yourHand.length; i++)
		{
			if (yourHand[i] < 14)
				yourHearts++;
			else if (yourHand[i]<27)
				yourDiamonds++;
			else if (yourHand[i]<40)
				yourClubs++;
			else
				yourSpades++;
			if (yourHearts >= yourClubs && yourHearts >= yourDiamonds && yourHearts >= yourSpades) {
				yourSuit = "hearts.";
				yourCounter = yourHearts;
				yourCardMin = 0;
				yourCardMax = 13;
			}//if
			else if (yourClubs > yourHearts && yourClubs > yourDiamonds && yourClubs> yourSpades) {
				yourSuit = "clubs.";
				yourCounter = yourClubs;
				yourCardMin = 14;
				yourCardMax = 26;
			}//else if
			else if (yourDiamonds > yourClubs && yourDiamonds > yourHearts && yourDiamonds > yourSpades) {
				yourSuit = "diamonds.";
				yourCounter = yourDiamonds;
				yourCardMin = 27;
				yourCardMax = 39;
			}//else if
			else if (yourSpades > yourClubs && yourSpades > yourDiamonds && yourSpades > yourHearts) {
				yourSuit = "spades.";
				yourCounter = yourSpades;
				yourCardMin = 40;
				yourCardMax = 52;
			}//else if
		}//for 
		System.out.println();
		System.out.print("Your suit is ");
		System.out.println(yourSuit);
		System.out.println("You have " + yourCounter + " " + yourSuit);
		boolean gameOver = false;
		while (gameOver == false) {
			if (myCounter == 5 || yourCounter == 5) {
				if (myCounter<yourCounter) {
					gameWinner = "You win! Congrats, friend!";
					gameOver = true;
				}//if
				else if (myCounter>yourCounter) {
					gameWinner = "I win! Good try, friend!";
					gameOver = true;
				}//else if
				else {
					gameWinner = "A tie! Let's play again!";
					gameOver = true;
				}//else
			}//if
			else {
				if (myTurn <= yourTurn) {
					myTurn++;
					System.out.println();
					System.out.println();
					System.out.println("My Draw #"+ myTurn);
					card = 1 + generator.nextInt(52);
					while (noDuplicatesCheck == false) {
						for (int x = 0; x < myHand.length; x++) {
							if (myHand[x] == card || yourHand[x]==card)
								card = 1 + generator.nextInt(52); 
							else
								noDuplicatesCheck = true;
						}//for
					}//while
					noDuplicatesCheck = false;
					System.out.println("I got card " + card);
					if (myCardMin < card && card < myCardMax) {
						for (int i = 0; i < myHand.length; i++) {
							if (myHand[i]!=card) {
								if (myHand[i] < myCardMin || myHand[i] > myCardMax) {
									myHand[i]=card;
									System.out.println("Sweet! I needed this.");
									myCounter++;
									break;
								}//if
																
							}//if
	
						}//for
							
					}//if
					else 
						System.out.println("I do not need this card.");
					
					System.out.print("My hand is ");
					stringMyHand = Arrays.toString(myHand);
					System.out.print(stringMyHand);	
					System.out.println();
					System.out.print("I have " + myCounter + " " + mySuit );
				}//if
				else {
						yourTurn++;
						System.out.println();
						System.out.println();
						System.out.println("You Draw #"+ yourTurn);
						card = 1 + generator.nextInt(52);
						while (noDuplicatesCheck == false) {
							for (int x = 0; x < myHand.length; x++) {
								if (myHand[x] == card || yourHand[x]==card)
									card = 1 + generator.nextInt(52); 
								else
									noDuplicatesCheck = true;
							}//for
						}//while
						noDuplicatesCheck = false;
						System.out.println("You got card " + card);
			
						if (yourCardMin < card && card < yourCardMax) {
							for (int i = 0; i < yourHand.length; i++) {
								if (yourHand[i]!=card) {
									if (yourHand[i] < yourCardMin || yourHand[i] > yourCardMax) {
										yourHand[i]=card;
										yourCounter++;
										System.out.println("Sweet! You needed this.");
										break;
									}//if
														
								}//if
		
							}//for
								
						}//if
						else 
							System.out.println("You do not need this card.");
						
						System.out.print("Your hand is ");
						stringYourHand = Arrays.toString(yourHand);
						System.out.print(stringYourHand);	
						System.out.println();
						System.out.print("You have " + yourCounter + " " + yourSuit );
					}//else
			}//else
			
		}//while
		System.out.println(gameWinner);
	}//main
	
}//class
