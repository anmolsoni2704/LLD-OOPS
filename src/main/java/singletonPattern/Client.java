package main.java.singletonPattern;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
    }
}
