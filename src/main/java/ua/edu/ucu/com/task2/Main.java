package ua.edu.ucu.com.task2;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder reportBuilder = new ReportBuilder(db);
            reportBuilder.buildReport();
        }
    }
}