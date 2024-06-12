package main.java.generics;

public class Pair <T, V>{
    T first;
    V second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static<A, B> void doSomethingStatic(A a, B b){

    }

    public void doSomethingNonStatic(T x){

    }

    public <Prateek> Prateek doSomethingForLearning(Prateek a){
        return a;
    }
}
