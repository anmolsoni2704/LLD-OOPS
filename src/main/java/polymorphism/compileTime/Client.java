package main.java.polymorphism.compileTime;

public class Client {
    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.add(1,2));
        System.out.println(math.add(1,2 , 3));
        System.out.println(math.add(10.1,20.2 , 30.3));
    }
}
