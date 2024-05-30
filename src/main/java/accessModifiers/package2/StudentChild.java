package main.java.accessModifiers.package2;

import main.java.accessModifiers.package1.Student;

public class StudentChild extends Student {
    void display(){
        System.out.println("Room Number: " + roomNo);
        System.out.println("Roll Number: " + rollNo);
    }
}
