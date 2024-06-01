package main.java.threads;

public class Client {
    public static void main(String[] args) {
        System.out.println("Current thread running in main is: " + Thread.currentThread().getName());

        PrintHelloWorld task1 = new PrintHelloWorld();
        Thread t1 = new Thread(task1);
        t1.start();

        for (int i = 0; i < 100; i++) {
            PrintNumber task2 = new PrintNumber(i);
            Thread t2 = new Thread(task2);
            t2.start();
        }
    }
}
