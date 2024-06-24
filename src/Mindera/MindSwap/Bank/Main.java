package Mindera.MindSwap.Bank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank("bmw");
        bank.ibangenerate();
        bank.ibangenerate();
        bank.ibangenerate();
        Client client = new Client("joao");
        bank.createCreditAccount("joao");


        // bank.deposit("bmw", "bmw", 10);
    /*
client.deposit(iban,10)
        bank.deposit(iban , 10)
*/
    }
}