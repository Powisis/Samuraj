package Piate.Zadanko.Drugie;

import java.util.Scanner;

public class ATM {

    public static String card;
    public static Software cardDB = new Software();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please insert your credit card");
        card = scanner.next();
        cardDB.checkCard(card);

        System.out.println("Choose: ");
        System.out.println("1. Account Balance");
        System.out.println("2. Withdraw money from a bank");
        System.out.println("3. Deposit money in a bank");
        System.out.println("4. Exit");

        boolean loop = true;
        while(loop) {
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("You have " + cardDB.getAccountBalance(card) + "$ on your account");
                    break;
                case 2:
                    System.out.println("How much money do you wanna take from your account?");
                    cardDB.paycheck(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("How much money do you wanna deposit on your account");
                    cardDB.payment(scanner.nextInt());
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }



        }

    }




}
