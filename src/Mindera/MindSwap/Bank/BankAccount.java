package Mindera.MindSwap.Bank;

public abstract class BankAccount {
    protected int balance;
    private Client[] client;
    private int iban;


    public BankAccount(int iban) {
        this.iban = iban;
        this.balance = 0;
    }

    public int getIban() {
        return iban;
    }


    public void pay(int payValue) {
        if (this.balance - payValue >= 0) {
            System.out.println("Successful purchase. It costs " + payValue);
        }
        System.out.println("Not enough money to buy that!");
    }

    public int getBalance() {
        System.out.println("Current balance is " + balance);
        return balance;
    }


    public void depositMoney(int depositValue) {
        this.balance = this.balance + depositValue;
        System.out.println("was deposit " + depositValue + " on this account");

    }


}
