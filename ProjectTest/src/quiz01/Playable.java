package quiz01;

public interface Playable {
	static void play() {
		System.out.println();
	}
}

class Movie implements Playable {
	Movie() {
		System.out.println("Movie");
	}
}

class Game implements Playable {
	Game() {
		System.out.println("Game");
	}
}