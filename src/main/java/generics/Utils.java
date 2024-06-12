package main.java.generics;

import java.util.List;

public class Utils {
    public static void simpleDoSomething(Animal animal) {

    }

    public static void doSomething(List<? extends Animal> animal){
        for(Animal a : animal){}
    }

    public static <T extends Animal> void doSomething2(List<T> animals) {

    }

    public static void printAnimalName(List<? extends Animal> animals) {
        for(Animal a : animals){
            System.out.println("Animal name is: " + a.name);
        }
    }

    public static <T extends A> void testInterfaces(List<T> x) {

    }

    /*
    ? extends Animal - anything which is Animal or children of Animal
    ? super Animal - anything which is Animal or parent of Animal
    ? super Dog - it's useful when we are concerned about only animal's attributes
     */
}
