package card;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Card card = new Card(0, 0);
//		play();
//		System.getProperties();
	}
	
	static void play() {
		List<Player> players = new ArrayList<Player>();
		Deck deck = new Deck();
		deck.shuffle();
		players.add(new Player("새똥이"));
		players.add(new Player("개똥이"));
		players.add(new Player("소똥이"));
		players.add(new Player("말똥이"));
		
		for (int i = 0; i < players.size(); i++) {
			for (int j = 0; j < players.get(i).cards.size(); j++) {
				players.get(i).cards.add(deck.pick());
			}
		}
		for(Player p : players) {
			System.out.println(p);
		}	
	}
}
