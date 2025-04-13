package quiz03;

public class quiz02captCha {
	public static void main(String[] args) {
        int length = 10;
        char[] captcha = new char[length];

        for (int i = 0; i < length; i++) {
            int charNum = (int) (Math.random() * 3);
            char chars;

            if (charNum == 0) {
                chars = (char) ('A' + (int) (Math.random() * 26));
            } else if (charNum == 1) {
                chars = (char) ('a' + (int) (Math.random() * 26));
            } else {
                chars = (char) ('0' + (int) (Math.random() * 10));
            }
            captcha[i] = chars;
        }
        System.out.print("CAPTCHA: ");
        for (int i = 0; i < captcha.length; i++) {
            System.out.print(captcha[i]);
        }
    }
}