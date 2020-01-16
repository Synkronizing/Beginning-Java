//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		stackOfCards = new ArrayList<>();
		topCardIndex = NUMCARDS - 1;
		
		//loop through suits
			//loop through faces
				//add in a new card
		for(int a=0; a<NUMSUITS;a++) {
			for(int b=1;b<NUMFACES+1;b++) {
				BlackJackCard newCard= new BlackJackCard();
				newCard.setSuit(SUITS[a]);
				newCard.setFace(b);
				stackOfCards.add(newCard);
				
			}
		}
		
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
	   Collections.shuffle(stackOfCards);
	   topCardIndex = NUMCARDS - 1;
	   

	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex+1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}