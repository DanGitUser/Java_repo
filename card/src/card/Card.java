package card;

public class Card{
	int number; // 2 ~ 10, J, Q, K, A
	int kind; // SPADE, DIAMON, HEART, CLOVER
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String numbers = "23456789XJQKA";
		String kinds = "♣♥♦♠";
		return "[" + kinds.charAt(kind) +"]" + numbers.charAt(number);
	}
	
	public static void main(String[] args) {
		Card card = new Card(3, 12);
		
		System.out.println(card);		
	}
}
