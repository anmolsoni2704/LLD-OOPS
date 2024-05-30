package main.java.interfaces;

public class Client {
    public static void main(String[] args) {
        YesBank yesBank = new YesBank(10000);
        yesBank.welcomeMessage();
        yesBank.checkBalance();
        yesBank.transferAmount("Akash", 4000);

        ICICIBank iciciBank = new ICICIBank(20000);
        iciciBank.welcomeMessage();
        iciciBank.checkBalance();
        iciciBank.transferAmount("Aditi", 22000);
    }
}
