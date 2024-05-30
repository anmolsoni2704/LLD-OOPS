package main.java.inheritance;

public class C extends B{
    C(){
        System.out.println("Constructor of C is called");
    }

    C(String name){
        super(2);
        System.out.println(name + " is called");
    }
}
