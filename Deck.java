import java.util.ArrayList;
import java.util.Random;

public class Deck{
	private ArrayList<Card> cards; 
	public  ArrayList<Card> usedCard;
	public  int nUsed; 
	public Deck(int nDeck){   
		cards = new ArrayList<Card>();
		for(int i=0;i<nDeck ;i++){			
			for (Card.Suit s : Card.Suit.values()){		
				for(int k=1;k<=13;k++){		
					Card card = new Card(s,k); 
					cards.add(card);		
				}
			}
		}
		shuffle();
	}	
	
	public void printDeck(){
		for(int i=0;i < cards.size();i++){
			Card printdeck = cards.get(i);
			printdeck.printCard();
			System.out.println(cards.size()); 
		}
	}
	public Card getOneCard(){   
		if(nUsed == 52){ 
			shuffle();
		} 
		Card newcard = cards.get(0);
		usedCard.add(newcard); //發出去的牌紀錄在ArrayList usedCard
		nUsed +=1; //發了幾張牌？紀錄在private int nUsed;
		cards.remove(newcard);
		return newcard; 
	}
	public void shuffle(){
		//把牌收回來
		 for(int j=0;j<nUsed;j++){
			cards.add(j,usedCard.get(j));
		}
		Random random = new Random();
		int k = random.nextInt(51+1);
		int i = random.nextInt(51+1);
		Card temp = cards.get(k);
		cards.set(k,cards.get(i));
		cards.set(i, temp);
		nUsed = 0;		 
		usedCard = new ArrayList<Card>(); 	
	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
}
