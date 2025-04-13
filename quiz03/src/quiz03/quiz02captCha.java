package quiz03;

public class quiz02captCha {
	public static void main(String[] args) {
        String charNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = 10;
        String captcha = "";

        for (int i = 0; i < length; i++) {
            int idx = (int) (Math.random() * charNum.length());
            captcha += charNum.charAt(idx);
        }
        System.out.println("Generated CAPTCHA: " + captcha);
    }
}