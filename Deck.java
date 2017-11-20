package homework3;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

// TODO Auto-generated method stub
		private ArrayList<Card> cards;
		private ArrayList<Card> usedCard=new ArrayList<Card>();
		public int nUsed;
		 
		public Deck(int nDeck){
			cards=new ArrayList<Card>();
			for(int deck=1;deck<=nDeck;deck++)
			{
			for (Card.Suit s : Card.Suit.values())
			{			
			for(int rank=1;rank<=13;rank++)
			{
			Card card=new Card(s,rank);
			cards.add(card);
			}
			}
			}}
		public void printDeck(){
		int n=0;//to get cards.get()
		while(cards.size()>n)//in this loop, n add 1 after every execution
		{ 
		Card card=new Card(cards.get(n).getSuit(),cards.get(n).getRank());
		//instance Card, cards.get().getSuit() for suit and cards.get(n).getRank() for numbers
		card.printCard();//run printCard() in Card class to print this card
		n++;
		}}
		public ArrayList<Card> getAllCards(){
		return cards;
		}
		
		public Card getOneCard() //���o�@�i�P
		{ 
			Card card=new Card(cards.get(1).getSuit(),cards.get(1).getRank());
			usedCard.add(card);
			nUsed+=1;
			return card;
		}
		
		public void shuffle()//�~�P
		{
		Random rnd = new Random();
		int j = rnd.nextInt(cards.size());//j�O52�i�P�����N��m
		usedCard=new ArrayList<Card>();//���]usedCard
		Card card=new Card(cards.get(j).getSuit(),cards.get(j).getRank());
		cards.set(j-1,card);//cards�����e����(�~�P)
		nUsed=0;//�ιL���P�k�s
		}
		
		public Deck(){
			shuffle();}	
	
	
	
	

}
