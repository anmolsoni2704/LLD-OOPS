package main.java.learningStatic;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        student.name = "Anmol";
        student.age = 24;
        Student.regNo = 1;
        Student.univName = "ABC";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(Student.regNo);
        System.out.println(Student.univName);
        Student.changeUnivName("IIT");
        System.out.println(Student.univName);
    }
}
