package main.java.adderSubtractorSyncMethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i < 100; i++) {
            count.incrementByX(i);
        }
        return null;
    }
}
