package main.java.accessModifiers.package1;

public class Student {
    private String name;
    protected int rollNo;
    String univName;
    public int roomNo;

    public Student(){
        rollNo = 1;
        name = "Soumya";
        univName = "ABC";
        roomNo = 203;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", University Name: " + univName + ", Room No: " + roomNo);
    }
}
