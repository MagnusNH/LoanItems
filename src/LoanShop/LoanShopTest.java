package LoanShop;

import java.util.Scanner;

public class LoanShopTest {
    public static void main (String [] args){
        welcomeMessage();
        userInput();
    }
//Laver en lille welcome message
// Aniko Se vi har sat emojis ind
    public static void welcomeMessage(){
        System.out.println("**********************************");
        System.out.println("**\uD83D\uDCD6Welcome to the loan shop!\uD83D\uDCD6**");
        System.out.println("**\uD83D\uDCFD We have Books and Videos!\uD83D\uDCFD**");
        System.out.println("**********************************");
    }

    public static void userInput(){
        //Scanner for user input
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
            }
        }
    }
}
