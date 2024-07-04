package main.java.singletonPattern;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;

    public static DatabaseConnection getInstance(){
        if(null == instance){
          synchronized (DatabaseConnection.class){
              if(null == instance){
                  instance = new DatabaseConnection();
              }
          }
        }
        return instance;
    }

    private DatabaseConnection(){};
}
