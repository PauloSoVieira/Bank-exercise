package Mindera.MindSwap.Bank;

public class DebitAccount extends BankAccount {
    // private int balance;


    public DebitAccount(int id) {
        super(id);
    }

    @Override
    public void depositMoney(int depositValue) {
        super.depositMoney(depositValue);
    }

    public void withdraw(int value) {
        if (value > 0 && balance > value) {
            this.balance = this.balance - value;
            System.out.println(" Withdrawal was successful :  New account balance is " + this.balance);
        } else {
            System.out.println("Invalid amount. Current balance is : " + this.balance);
        }
    }
}
