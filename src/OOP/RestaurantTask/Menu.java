package OOP.RestaurantTask;

public class Menu {
    public static void getAdminMenu() {
        System.out.println("1.Add new food to restaurant \n"+
                "2.Remove a food from restaurant \n"+
                "3.Print the list of foods \n"+
                "4.Search a food from restaurant \n"+
                "5.Exit");
    }

    public static void getPersonalMenu() {
        if (TableUtil.tablesCount != 0){
            for (int i = 0; i < TableUtil.tablesCount; i++) {
                System.out.println((i+1)+".Table 1");
            }
            System.out.println("1.Add new table \n"+
                    "4.Exit");
        }
        System.out.println("1.Add new table \n"+
                "4.Exit");
    }
}
