package main.java.inheritance;

public class B extends A{
    B() {
        System.out.println("Constructor of B is called");
    }

    B(int x){
        System.out.println("Number: " + x);
    }
}
