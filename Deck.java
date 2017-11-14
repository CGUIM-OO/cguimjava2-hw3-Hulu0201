import java.util.ArrayList;
import java.util.Random;

public class Deck{
	private ArrayList<Card> cards; 
	public  ArrayList<Card> usedCard;
	public  int nUsed; 
	//TODO: Please implement the constructor (30 points)
	public Deck(int nDeck){   
		cards = new ArrayList<Card>();
		for(int i=0;i<nDeck ;i++){			//�X�ƵP
			for (Card.Suit s : Card.Suit.values()){		//��� Enhance For Loop
				for(int k=1;k<=13;k++){		//�j�p
					Card card = new Card(s,k); //
					cards.add(card);		//�N�C�@�i�P��iArrayList��
				}
			}
		}
		//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		//Hint: Use new Card(x,y) and 3 for loops to add card into deck
		//Sample code start
		//Card card=new Card(1,1); ->means new card as clubs ace
		//cards.add(card);
		//Sample code end
		shuffle();//�̫�I�sshuffle() method
	}	
	//TODO: Please implement the method to print all cards on screen (10 points)
	public void printDeck(){
		//Hint: print all items in ArrayList<Card> cards,
		for(int i=0;i < cards.size();i++){
			Card printdeck = cards.get(i);
			printdeck.printCard();
			System.out.println(cards.size()); //�ˬd�`�@�P��
		}
		//TODO: please implement and reuse printCard method in Card class (5 points)
	}
	public void shuffle(){
		usedCard = new ArrayList<Card>(); 
			Random rnd = new Random();
			int j = rnd.nextInt(51+1);
			Card temp = cards.get(j);
			cards.set(j,cards.get(0));
			cards.set(0, temp);
			  //reset
		nUsed = 0;				
		usedCard = new ArrayList<Card>(); 	
	}
	public Card getOneCard(){   //�^��Card object
		Random rnd = new Random();
		if(nUsed == 52){ //�n�ˬd�S�P�F (�P���o���F) ����H shuffle() �I
			shuffle();
		}
		usedCard = new ArrayList<Card>(); 
		int j = rnd.nextInt(51+1);
		Card newcard = cards.get(j);
		newcard.getSuit();
		newcard.getRank();
		usedCard.add(newcard);//�o�X�h���P�����bArrayList usedCard
		cards.remove(j);
		nUsed +=1;
		cards.add(j,newcard);
		//�o�F�X�i�P�H�����bprivate int nUsed;
		//���ʵP��index
		
		return newcard; 
	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
}
