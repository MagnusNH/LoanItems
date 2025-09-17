package LoanShop;

import java.util.Scanner;

public class LoanShopTest {
    public static void main (String [] args){
        welcomeMessage();
    }

    public static void welcomeMessage(){
        System.out.println("**********************************");
        System.out.println("**\uD83D\uDCD6Welcome to the loan shop!\uD83D\uDCD6**");
        System.out.println("**\uD83D\uDCFD We have Books and Videos!\uD83D\uDCFD**");
        System.out.println("**********************************");
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many items would you like to loan? ");
        int i = scanner.nextInt();


    }
}
