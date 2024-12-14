package ua.edu.ucu.com.task2;

public class ReportBuilder {
    private Database db;
    public ReportBuilder(Database db) {
        this.db = db;
    }
    public void buildReport() {
        String userData = db.getUserData();
        String statsData = db.getStatisticalData();
        System.out.println("User Data: " + userData);
        System.out.println("Statistical Data: " + statsData);
    }
}
