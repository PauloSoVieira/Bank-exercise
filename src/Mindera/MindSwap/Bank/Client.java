package Mindera.MindSwap.Bank;

public class Client {
    private String name;
    private BankAccount[] accounts;
    private Card[] cards;

    public Client(String name) {
        this.name = name;
        this.cards = new Card[100];
        this.accounts = new BankAccount[100];
    }

    public String getName() {
        return name;
    }


}


