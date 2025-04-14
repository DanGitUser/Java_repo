package quiz03;

import java.util.Scanner;

public class quiz01moneyBill {
    public static void main(String[] args) {
        System.out.println("Enter Value of Cash to break it down into different units: ");
        Scanner scan = new Scanner(System.in);
        
        int money = scan.nextInt();
        int[] units = {50000, 10000, 5000, 1000};
        int[] count = new int[units.length];
        int totalBills = 0;

        for (int i = 0; i < units.length; i++) {
            count[i] = money / units[i];
            money %= units[i];
            totalBills += count[i];
        }
        
        System.out.println("Result:");
        for (int i = 0; i < units.length; i++) {
            System.out.println(units[i] + ": " + count[i] + " bills");
        }
        
        System.out.println("Total number of bills: " + totalBills);
        scan.close();
    }
}
