package Mindera.MindSwap.Bank;

import java.util.Arrays;

public class Bank {
    private String name;
    private BankAccount[] bankAccounts;
    private CreditAccount[] creditAccounts;
    private DebitAccount[] debitAccounts;
    private Client[] clients;


    public Bank(String name) {
        this.name = name;
        this.creditAccounts = new CreditAccount[100];
        this.debitAccounts = new DebitAccount[100];
        this.clients = new Client[100];
    }

    public int ibangenerate() {
        int iban = MyUniqueNumber.getInstance().getUniqueNumber();
        System.out.println(iban);
        return iban;

    }

    public void deposit(Client client, BankAccount account, int value) {
        if (client == null || account == null) {
            System.out.println("Client or account doesn't exist");
            return;
        } else if (value <= 0) {
            System.out.println("Can't deposit that amount");
            return;
        }
        account.depositMoney(value);
        System.out.println("Deposited " + value + " on account " + account.getIban() + " for client " + client.getName());
    }

    public void withdraw(Client client, DebitAccount account, int value) {
        if (client == null || account == null) {
            System.out.println("Client or account doesn't exist");
            return;
        } else if (value <= 0) {
            System.out.println("Can't withdraw that amount");
            return;
        }
        account.withdraw(value);
        System.out.println("Withdrew " + value + " from account " + account.getIban() + " for client " + client.getName());
    }

    public void createCreditAccount(String name) {
        if (creditAccounts == null) {
            for (int i = 0; i < creditAccounts.length; i++) {
                CreditAccount[] creditAccount = new CreditAccount[]{new CreditAccount(ibangenerate())};
                System.out.println(Arrays.toString(creditAccount));
                System.out.println(Arrays.toString(creditAccount));
            }

        }
        System.out.println(name + " already has credit account");
    }


    public DebitAccount createDebitAccount() {
        if (debitAccounts == null) {
            DebitAccount debitAccount = new DebitAccount(ibangenerate());
            return debitAccount;
        } else {
            System.out.println(name + " already has a debit account");
            return null;
        }
    }


    @Override
    public String toString() {
        return "Bank{" +
                "creditAccounts=" + Arrays.toString(creditAccounts) +
                '}';
    }
/*
    public void getIban(String name) {
        if (creditAccounts != null) {
            for (int i = 0; i < creditAccounts.length; i++) {
                System.out.println(creditAccounts[i].getIban());
            }
        }
        System.out.println("Theres no credit accounts on this name");
        if (debitAccounts != null) {
            for (int i = 0; i < debitAccounts.length; i++) {
                System.out.println(debitAccounts[i].getIban());
            }
        }
        System.out.println("Theres no debit accounts");

    }
*/
}
