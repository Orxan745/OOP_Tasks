package OOP.DataBaseConnectionTask;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection db1 = DataBaseConnection.createDataBaseConnection();
        DataBaseConnection db2 = DataBaseConnection.createDataBaseConnection();

        boolean b = db1 == db2;
        System.out.println(b);
    }
}
