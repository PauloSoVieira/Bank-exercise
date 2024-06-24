package Mindera.MindSwap.Bank;

public class MyUniqueNumber {
    private static MyUniqueNumber myUniqueNumber;
    int number;
    int seedValue = 10000001; //custom seed value to begin with

    private MyUniqueNumber() { //Singleton !!!
        number = seedValue; //init to zero
    }

    public static MyUniqueNumber getInstance() {
        if (myUniqueNumber == null) {
            myUniqueNumber = new MyUniqueNumber();
        }
        return myUniqueNumber;
    }

    public static void main(String[] args) {
        MyUniqueNumber myUniqueNumber = MyUniqueNumber.getInstance();
        for (int n = 0; n <= 5; n++) {
            System.out.println("read number: " + myUniqueNumber.getUniqueNumber());
        }
    }

    public int getUniqueNumber() {
        number += 1; //simple increment by 1 , you can modify this further
        return number;
    }
}
