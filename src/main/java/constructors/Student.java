package main.java.constructors;

public class Student {
    String name;
    int rollNo;
    String univName;
    int roomNo;

    Student(){}

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    Student(Student s){
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.univName = s.univName;
        this.roomNo = s.roomNo;
    }

    void display() {
        System.out.println("My name is " + name + ". My roll number is " + rollNo + ".");
    }
}
