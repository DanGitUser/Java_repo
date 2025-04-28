package phone;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneService2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Simple Phone App!");

        // Main loop
        while (true) {
            // Display the current time
            displayCurrentTime();

            // Show available commands
            System.out.println("Available commands: ");
            System.out.println("1. Open App");
            System.out.println("2. Exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            // Process the command
            switch (command) {
                case "1":
                    openApp();
                    break;
                case "2":
                    System.out.println("Exiting the app. Goodbye!");
                    scanner.close();
                    return; // Exit the application
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private static void displayCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());
        System.out.println("Current Time: " + currentTime);
    }

    private static void openApp() {
        System.out.println("App opened! (This is a placeholder for an actual app.)");
    }
}
