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
        System.out.println("1.Add an order \n"+
                "2.Remove an order \n"+
                "3.See order list and total selling \n"+
                "4.Exit");
    }
}
