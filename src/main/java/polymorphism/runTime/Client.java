package main.java.polymorphism.runTime;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.doSomething();

        Instructor instructor = new Instructor();
        instructor.doSomething();

        User user1 = new Instructor();
        user1.doSomething();
    }
}
