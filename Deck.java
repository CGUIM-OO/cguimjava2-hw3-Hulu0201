import java.util.ArrayList;


public class Deck{
	private ArrayList<Card> cards;  //private �~���קK�P�Q���
	//TODO: Please implement the constructor (30 points)
	public Deck(int nDeck){   
		cards = new ArrayList<Card>();
		for(int i=0;i<nDeck ;i++){			//�X�ƵP
			for(int j=1;j<=4;j++){			//���
				for(int k=1;k<=13;k++){		//�j�p
					//System.out.println(j+","+k);
					Card card = new Card(j,k);
					cards.add(card);		//�N�C�@�i�P��iArrayList��
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
