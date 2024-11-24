package OOP.RestaurantTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter the password: ");
            String password = scanner.next();

            if (Account.adminPassword.equals(password)) {
                while (true) {
                    Menu.getAdminMenu();
                    System.out.print("Please select an option: ");
                    int option = scanner.nextInt();
                    if (option == 5) {
                        break;
                    }
                    switch (option) {
                        case 1 -> MenuUtil.addFood();
                        case 2 -> MenuUtil.removeFood();
                        case 3 -> RestaurantUtil.printFoodList();
                        case 4 -> MenuUtil.searchFood();
                    }
                }
            } else if (Account.personalPassword.equals(password)) {
                while (true) {
                    Menu.getPersonalMenu();
                    System.out.print("Please select an option: ");
                    int option = scanner.nextInt();
                    if (option == 4) {
                        break;
                    }
                    switch (option) {
                        case 1 -> MenuUtil.addOrder();
                        case 2 -> MenuUtil.removeOrder();
                        case 3 -> OrderUtil.printOrderList();
                    }
                }
            } else {
                System.out.println("Incorrect password!");
                System.exit(0);
            }
        }
    }
}
