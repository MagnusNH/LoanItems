package LoanShop;

import java.util.Scanner;

public class LoanShopTest {
    public static void main(String[] args) {
        welcomeMessage();
        userInput();
    }

    //Laver en lille welcome message
// Aniko Se vi har sat emojis ind
    public static void welcomeMessage() {
        System.out.println("**********************************");
        System.out.println("**\uD83D\uDCD6Welcome to the loan shop!\uD83D\uDCD6**");
        System.out.println("**\uD83D\uDCFD We have Books and Videos!\uD83D\uDCFD**");
        System.out.println("**********************************");
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);

        int amountItems = 0;
        int maxAmountItems = 10;

        while (amountItems <= 0 || amountItems > maxAmountItems) {
            System.out.println("How many items would you like to loan? ");

            if (scanner.hasNextInt()) {
                amountItems = scanner.nextInt();
                scanner.nextLine();
            }

            if (amountItems <= 0) {
                System.out.println("You need to loan atleast 1 item");
            } else if (amountItems > maxAmountItems) {
                System.out.println("Please only input a max of " + maxAmountItems);
                System.out.println();
            }
        }
        Items[] items = new Items[amountItems];

        for (int i = 0; i < amountItems; i++) {
            String type = "";
            boolean validType = false;
// vil blive ved med at spørge indtil man skriver en valid type
            while (!validType) {
                System.out.println("Enter type for item " + (i + 1) + " (Book/Video): ");
                type = scanner.nextLine();

                if (type.equalsIgnoreCase("Book") || type.equalsIgnoreCase("Video")) {
                    validType = true;
                } else {
                    System.out.println("Error 404: please only input Book or Video");
                    System.out.println();
                }
            }

            // vil så spørge om title efter man har skrevet en valid type
            System.out.println("Enter the title: ");
            String title = scanner.nextLine();
            if (type.equalsIgnoreCase("Book")) {
                items[i] = new Book(title, type, id);
            } else {
                items[i] = new Video(title, type, id);
            }
        }
        System.out.println("List of loan items:");
        System.out.println("-------------------");
        System.out.println("ID\tType\tTitle");
        for (Items a : items) {
            System.out.println(a.toString());
        }
    }
}