package OOP.RestaurantTask;

import java.util.Scanner;

public class MenuUtil {

    public static void addFood() {
        Scanner scanner = new Scanner(System.in);
        Food food = new Food();
        System.out.print("Name: ");
        String foodName = scanner.nextLine();
        System.out.print("Price: ");
        double foodPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Category: ");
        String foodCategory = scanner.nextLine();

        food.setFoodName(foodName);
        food.setPrice(foodPrice);
        food.setCategory(foodCategory);

        RestaurantUtil.addNewFood(food);
    }

    public static void removeFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of food you want to remove: ");
        String foodName = scanner.nextLine();

        RestaurantUtil.removeFood(foodName);
    }

    public static void searchFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of food you want to search: ");
        String foodName = scanner.nextLine();

        RestaurantUtil.searchFood(foodName);
    }

    public static void addOrder() {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        System.out.print("Order: ");
        String foodName = scanner.nextLine();
        order.setOrder(foodName);

        OrderUtil.addNewOrder(order);
    }

    public static void removeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the order you want to remove: ");
        String orderName = scanner.nextLine();

        OrderUtil.removeOrder(orderName);
    }
}
