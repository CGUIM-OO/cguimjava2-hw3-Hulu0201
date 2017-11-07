
public class Card {
	
		private int suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
		private int rank; //1~13
		/**
		 * @param s suit
		 * @param r rank
		 */
		public Card(int s,int r){  //Constructor
			suit=s;
			rank=r;
		}	
		//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
		public void printCard(){
			String suit_s = "";
			String rank_s = "";
			//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
			switch (suit){
			case 1: suit_s = "Clubs"; break;
			case 2: suit_s = "Diamonds"; break;
			case 3: suit_s = "Hearts"; break;
			case 4:	suit_s = "Spades"; break;
			}
			
			switch (rank){
			case 1: rank_s = "Ace"; break;
			case 2: rank_s = "2"; break;
			case 3: rank_s = "3"; break;
			case 4: rank_s = "4"; break;
			case 5: rank_s = "5"; break;
			case 6: rank_s = "6"; break;
			case 7: rank_s = "7"; break;
			case 8: rank_s = "8"; break;
			case 9:	rank_s = "9"; break;
			case 10: rank_s = "10"; break;
			case 11: rank_s = "J"; break;
			case 12: rank_s = "Q"; break;
			case 13: rank_s	= "K"; break;
			}	
			
			System.out.println(suit_s+","+rank_s);
			
		}
		public int getSuit(){
			return suit;
		}
		public int getRank(){
			return rank;
		}
}
