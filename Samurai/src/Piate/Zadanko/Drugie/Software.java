package Piate.Zadanko.Drugie;

public class Software extends ATM{
    
    private String[] cardNumbers = {"AAA", "BBB", "CCC"};
    private int[] accountBalance = {150000, 78043, 1200};

    
    public int getAccountBalance(String card){
        int result = 0;

        for(int i = 0; i<cardNumbers.length; i++){
            if(card.equals(cardNumbers[i])){
                result = accountBalance[i];
            }
        }
        return result;
    }

    public void updateAccountBalance(String card, int pay){
        for(int i = 0; i<cardNumbers.length; i++){
            if(card.equals(cardNumbers[i])){
                accountBalance[i] = accountBalance[i] - pay;
            }
        }
    }

    public void updateAccountBalance2(String card, int pay){
        for(int i = 0; i<cardNumbers.length; i++){
            if(card.equals(cardNumbers[i])){
                accountBalance[i] = accountBalance[i] + pay;
            }
        }
    }

    public void checkCard(String card){
        if(!card.equals("AAA") && (!card.equals("BBB")) && (!card.equals("CCC"))) {
            System.out.println("Access denied, you're not our customer");
            System.exit(0);
        }
        else if(card.equals("AAA"))
            System.out.println("Welcome Mark");
        else if(card.equals("BBB"))
            System.out.println("Welcome Anna");
        else if(card.equals("CCC"))
            System.out.println("Welcome Dave");
    }

    static void paycheck(int pay){
        if(pay<=cardDB.getAccountBalance(card)){
            cardDB.updateAccountBalance(card, pay);
            System.out.println("Paid: " + pay + " Left " + cardDB.getAccountBalance(card));
        }
        else
            System.out.println("Too few funds in the account, choose another operation or reduce the amount.");
    }

    static void payment(int pay){
            int Balance = cardDB.getAccountBalance(card) + pay;
            cardDB.updateAccountBalance2(card, pay);
            System.out.println("Account balance: " + cardDB.getAccountBalance(card));
    }


}
