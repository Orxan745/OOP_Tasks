package OOP.DataBaseConnectionTask;

public class DataBaseConnection {

    public boolean dataBaseConnection = false;

    public static boolean check = false;

    public static DataBaseConnection createDataBaseConnection() {
        if (check) {
            System.err.println("Can't create Data base connection twice!");
            return null;
        }else {
            DataBaseConnection dataBase = new DataBaseConnection();
            dataBase.dataBaseConnection = true;
            check = true;
            return dataBase;
        }
    }

    public static boolean getDataBaseConnection(DataBaseConnection dataBase) {
        return dataBase.dataBaseConnection;
    }

    public static void dataBaseDisconnection(DataBaseConnection dataBase) {
        if (!dataBase.dataBaseConnection) {
            System.out.println("-------------------------------------------------------");
            System.out.println("There is no Database connection to disconnect!");
            System.out.println("-------------------------------------------------------");
        }else {
            dataBase.dataBaseConnection = false;
            check = false;
            System.out.println("---------------------------------------------");
            System.out.println("Successfully disconnected from Database!");
            System.out.println("---------------------------------------------");
        }
    }
}
