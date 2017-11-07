import java.util.ArrayList;


public class Deck{
	private ArrayList<Card> cards;  //private 才能避免牌被更動
	//TODO: Please implement the constructor (30 points)
	public Deck(int nDeck){   
		cards = new ArrayList<Card>();
		for(int i=0;i<nDeck ;i++){			//幾副牌
			for(int j=1;j<=4;j++){			//花色
				for(int k=1;k<=13;k++){		//大小
					//System.out.println(j+","+k);
					Card card = new Card(j,k);
					cards.add(card);		//將每一張牌放進ArrayList中
					//System.out.println(card); Wrong   //Card@7d4991ad
				}
			}
		}
		//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		//Hint: Use new Card(x,y) and 3 for loops to add card into deck
		//Sample code start
		//Card card=new Card(1,1); ->means new card as clubs ace
		//cards.add(card);
		//Sample code end
	}	
	//TODO: Please implement the method to print all cards on screen (10 points)
	public void printDeck(){
		//Hint: print all items in ArrayList<Card> cards,
		for(int i=0;i < cards.size();i++){
			Card printdeck = cards.get(i);
			printdeck.printCard();
			System.out.println(cards.size());
		}
	
		//TODO: please implement and reuse printCard method in Card class (5 points)
	
		
	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
}
