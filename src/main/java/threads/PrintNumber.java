package main.java.threads;

public class PrintNumber implements Runnable{
   private int number;

    public PrintNumber(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Printing number: " + number + " by thread: " + Thread.currentThread().getName());
    }
}
