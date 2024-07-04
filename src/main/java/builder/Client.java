package main.java.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Anmol")
                .setAge(24)
                .setBatch("2019")
                .setGradYear(2023)
                .setUniversityName("BU")
                .setPsp(94.6)
                .setPhoneNo("1234567890")
                .build();
    }
}
