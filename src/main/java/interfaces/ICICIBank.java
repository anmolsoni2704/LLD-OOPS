package main.java.interfaces;

public class ICICIBank implements Phonepe{
    private double amount;

    public ICICIBank(double amount) {
        this.amount = amount;
    }

    @Override
    public void checkBalance() {
        System.out.println("Your current balance amount is " + amount);
    }

    @Override
    public boolean transferAmount(String recipient, int enteredAmount) {
        if(amount - enteredAmount >= 0){
            System.out.println(enteredAmount + " is successfully transferred to " + recipient + ". The current balance is " + (amount-enteredAmount));
            return true;
        }else{
            System.out.println("Insufficient balance, transaction failed.");
            return false;
        }
    }

    public void welcomeMessage() {
        System.out.println("Welcome to ICICI Banking services.");
    }
}
