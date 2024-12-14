package ua.edu.ucu.com.task2;

public class Authorization {
    public boolean authorize(Database db) {
        db.getUserData();
        return true;
    }
}