package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair p1 = new Pair();

        /*
        By default, if we don't pass data type of pair class, it will take any values.
        It will be of Object datatype also known as raw type
         */
        p1.first = "ABC";
        p1.second= 23.45;

        /*
        By passing the data types while declaring Pair class,
        it adds the compiler check to avoid entering invalid data types
         */
        Pair<Integer, String> p2 = new Pair<>();
        p2.first = 12;
        p2.second = "ABC";

        Pair<Integer, Integer> p3 = new Pair<>();
        Pair<Integer, String> p4 = new Pair<>();

        p4.doSomethingNonStatic(12);

        Pair.<String, Integer>doSomethingStatic("Anmol", 14);
        Pair.doSomethingStatic("anything", 112);

        String res1 = p3.doSomethingForLearning("Anmol");
        Integer res2 = p3.<Integer>doSomethingForLearning(12);

//        Pair.doSomethingStatic(12);
        /*
        Static methods cannot refer a class level generic data type as to call
        these method, we don't need the object because of which we will not be
        able to know the respective data types you're referring to.
         */


//        ---------------------------Inheritance and Generics -----------------------------
        Utils.simpleDoSomething(new Animal());
        Utils.simpleDoSomething(new Dog());
        Utils.simpleDoSomething(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        List<Animal> animals = new ArrayList<>();

        Utils.doSomething(animals);
        Utils.doSomething(dogs);
        Utils.doSomething(cats);

        Utils.doSomething2(animals);
        Utils.doSomething2(dogs);
        Utils.doSomething2(cats);

        Utils.printAnimalName(animals);
        Utils.printAnimalName(dogs);
        Utils.printAnimalName(cats);
        /*
        We cannot store List<Dog> in List<Animal> - Not allowed
        we can store only Dog in Animal
         */
    }
}
