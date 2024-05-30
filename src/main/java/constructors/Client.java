package main.java.constructors;

public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();

        Student student2 = new Student("Anmol", 007);
        student2.display();

        Student student3 = new Student(student2);
        student3.display();
    }
}
