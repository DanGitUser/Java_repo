package lesson07;

public class Tv {
	//Field (Member Variable)
	//Power, Channel, Volume
	
	//Method (Function)
	//Power on/off, channel up/down, volume up/down
	
	boolean power;
	int channel;
	int volume;
	
	void doPower() {
		power = !power; //swaps true/false state of powerOn?
	}
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
	void volumeUp() {
		volume++;
	}
	void volumeDown() {
		volume--;
	}
}
