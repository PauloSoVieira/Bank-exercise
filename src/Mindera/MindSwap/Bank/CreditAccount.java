package Mindera.MindSwap.Bank;

public class CreditAccount extends BankAccount {
    private int creditLimit = -100;
    private int fee = 5;

    public CreditAccount(int id) {
        super(id);
    }

    @Override
    public void depositMoney(int depositValue) {
        super.depositMoney(depositValue);
    }

    @Override
    public void pay(int payValue) {
        int newBalance = balance - payValue;
        if (newBalance >= creditLimit) {
            if (balance >= 0 && newBalance < 0) {
                newBalance = newBalance - fee;
            }
            balance = -newBalance;
            return;
        }
        System.out.println("Credit limit is only " + creditLimit);
    }
}
