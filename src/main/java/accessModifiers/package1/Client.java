package main.java.accessModifiers.package1;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNo = 12;
        student.roomNo = 403;
        student.univName = "ABC";

        student.display();

        Student student1 = new Student();
        student1.display();
    }
}
