package quiz03;

public class quiz08dice {
	public static void main(String[] args) {
        int roll = 0;
        int rslt;
        
        do {
        	rslt = (int)(Math.random() * 6) + 1;
            roll++;
            System.out.println("(" + rslt + ")");
        } while (rslt != 6);       
        System.out.println(roll + " roll(s) to get a 6.");
    }
}
