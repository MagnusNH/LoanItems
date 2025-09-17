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
        //Scanner så vi får noget userinput
        int amountItems = 0;
        int maxAmountItems = 10;
        int id = 0;
        //Den spørg hvor mange bøger og film vi vil låne så længe man ikke låner mere end 10 ting
        while (amountItems <= 0 || amountItems > maxAmountItems) {
            System.out.println("How many items would you like to loan? ");

            //Sørger for at vi kun tager imod hele numre
            if (scanner.hasNextInt()) {
                amountItems = scanner.nextInt();
                scanner.nextLine();
            } else {
            //Ellers printe rden en fejlkode.
                System.out.println("Error 404: Only whole numbers, try again");
                scanner.nextLine();
                continue;
            }
            //Denne sørger for, at du låner mindst 1 item
            if (amountItems <= 0) {
                System.out.println("You need to loan atleast 1 item");
            } else if (amountItems > maxAmountItems) {
            //Ellers printer den en fejl kode, med max amount af items.
                System.out.println("Please only input a max of " + maxAmountItems);
                System.out.println();
            }

        }

        //Der oprettes et array for items
        Items[] items = new Items[amountItems];

        //Kører indtil at i ikke er mindre end amountItems
        for (int i = 0; i < amountItems; i++) {
            //Variablen intialiseres
            String type = "";
            //boolean oprettes med startværdi som false
            boolean validType = false;
            // vil blive ved med at spørge indtil man skriver en valid type
            while (!validType) {
                System.out.println("Enter type for item " + (i + 1) + " (Book/Video): ");
                type = scanner.nextLine();
                //Funktion til kun at godtage input for book og video (Ignorer stort tegn)
                if (type.equalsIgnoreCase("Book") || type.equalsIgnoreCase("Video")) {
                    validType = true;
                } else {
                    //Printer en fejlkode, hvis man ikke skriver book eller video
                    System.out.println("Error 404: please only input Book or Video");
                    System.out.println();
                }
            }

            // vil så spørge om title efter man har skrevet en valid type
            System.out.println("Enter the title: ");
            String title = scanner.nextLine();
            //Ligger 1 til id'et, hver gang at loopet kører.
            id = id + 1;
            //Hvis den skriver book, vil den komme med title, type og id
            if (type.equalsIgnoreCase("Book")) {
                items[i] = new Book(title, type, id);
            } else {
            //Hvis man skriver video, vil den komme med title,type og id
                items[i] = new Video(title, type, id);
            }
        }
        //Her printer den en liste over lånte bøger og film ud med id nummer :)
        System.out.println("List of loan items:");
        System.out.println("-------------------");
        System.out.println("ID\tType\tTitle");
        for (Items a : items) {
            System.out.println(a.toString());
        }
    }
}