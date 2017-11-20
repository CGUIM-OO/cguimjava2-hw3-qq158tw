package homework3;

public class Card {
enum Suit{Club,Diamond,Heart,Spades};
	
		// TODO Auto-generated method stub
		 
		private int rank; //1~13
		private Suit suit;//Club,Diamond,Heart,Spades
		public Card(Suit s,int r)
		{
	       suit=s;
		   rank=r;
			  }
			 
		public void printCard()
		 {
		String []R={"Ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
			 
			System.out.println(getSuit()+R[(getRank()-1)]); 
			}
		 
		public Suit getSuit(){
			return suit;
		}
		public int getRank(){
			return rank;
		}
	}
	 

