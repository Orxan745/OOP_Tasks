package OOP.databaseconnection;

public class DataBaseConnection {

    private DataBaseConnection(){

    }

    private static DataBaseConnection instance;

    public static DataBaseConnection createDataBaseConnection(){
        if(instance==null) instance = new DataBaseConnection();
        return instance;
    }
}
