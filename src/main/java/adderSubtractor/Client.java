package main.java.adderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();

        ExecutorService executorService = Executors.newCachedThreadPool();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Future<Void> res1 = executorService.submit(adder);
        Future<Void> res2 = executorService.submit(subtractor);

        res1.get();
        res2.get();

        System.out.println(count.value);
    }
}
