package Mindera.MindSwap.Bank;

public abstract class Card {
    protected BankAccount account;
    protected boolean hasCard;


    public Card(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void pay(int value) {
        // Same as account??????
    }

    ;
}
