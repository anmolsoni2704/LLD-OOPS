package main.java.lambdasAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        /*
        Runnable
        Callable
        Comparable
        Comparator
        Functional Interface - Some of the interfaces who demand just one method to be implemented.
        Lambdas - Way to create objects of classes who implement functional interfaces.

        () -> {} = Syntax of a lambda expression in java
        (input to the function/method) -> {output from the method}
         */

        List<Student> list = new ArrayList<>();
        list.add(new Student("Anmol",99,"Bharath"));
        list.add(new Student("Akash",90,"Manan"));
        list.add(new Student("Aditi",80,"Greenfield"));

        /*
        I want to sort this student list
         */

        Collections.sort(list);
        Collections.sort(list, new StudentPSPComparator());

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        /*
        You can even beautify the above code.
         */
        Collections.sort(list, (Student o1, Student o2) -> {
            return (int)(o1.psp - o2.psp);
        });

        /*
        Lambdas are just syntactical sugar.
         */
        /*
        I want to print hello world using a thread
         */

        HelloWorldPrint task = new HelloWorldPrint();
        Thread t1 = new Thread(task);
        t1.start();

        Thread t2 = new Thread(() -> System.out.println("hello world"));
        t2.start();
        /*
        Curly braces are optional if there's only 1 line of code
         */


        /*
        I want to do some arithmetic operations.
        Addition
        Subtraction
        Multiplication
        Division
         */




    }
}
