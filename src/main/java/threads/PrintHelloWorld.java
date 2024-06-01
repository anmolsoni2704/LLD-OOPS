package main.java.threads;

public class PrintHelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing hello world by thread: " + Thread.currentThread().getName());
    }
}
