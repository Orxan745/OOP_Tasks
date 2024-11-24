package OOP.DataBaseConnectionTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String menu = "1. Create the Database Connection \n"+
                    "2. Get the Database situation \n" +
                    "3. Disconnection of the Database \n" +
                    "4. Exit the program";
            System.out.println(menu);
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    DataBaseConnection dataBase = DataBaseConnection.createDataBaseConnection();
                    if (dataBase == null) {
                        System.exit(0);
                    }else {
                        System.out.println("---------------------------------------------");
                        System.out.println("Database connection successfully provided!");
                        System.out.println("---------------------------------------------");
                    }
                }
                case 2 -> {
                    DataBaseConnection dataBase = new DataBaseConnection();
                    dataBase.dataBaseConnection = DataBaseConnection.check;
                    boolean b = DataBaseConnection.getDataBaseConnection(dataBase);

                    if (b) {
                        System.out.println("---------------------------------------------");
                        System.out.println("Database connection is available!");
                        System.out.println("---------------------------------------------");
                    }else {
                        System.out.println("---------------------------------------------");
                        System.out.println("Database connection is not available!");
                        System.out.println("---------------------------------------------");
                    }
                }
                case 3 -> {
                    DataBaseConnection dataBase = new DataBaseConnection();
                    dataBase.dataBaseConnection = DataBaseConnection.check;
                    DataBaseConnection.dataBaseDisconnection(dataBase);
                }
                case 4 -> System.exit(0);
            }
        }
    }
}
