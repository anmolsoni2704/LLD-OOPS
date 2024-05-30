package main.java.learningStatic;

public class Student {
    public String name;
    public int age;
    public static String univName;
    public static int regNo;

    static void changeUnivName(String newUnivName) {
        univName = newUnivName;
    }
}
