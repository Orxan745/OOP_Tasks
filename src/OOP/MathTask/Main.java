package OOP.MathTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String menu = "1. Sum of the numbers \n" +
                    "2. Difference of the numbers \n" +
                    "3. Product of the numbers \n" +
                    "4. Division of the numbers \n";
            System.out.println(menu);
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Please enter the numbers you want to sum: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = MathUtils.sum(a, b);
                    System.out.println("Sum of the numbers: " + c);
                }
                case 2 -> {
                    System.out.print("Please enter the numbers you want to find difference: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = MathUtils.difference(a, b);
                    System.out.println("Difference of the numbers: " + c);
                }
                case 3 -> {
                    System.out.println("Please enter the numbers you want to find product: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = MathUtils.product(a, b);
                    System.out.println("Product of the numbers: " + c);
                }
                case 4 -> {
                    System.out.print("Please enter the numbers you want to divide: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    double c = MathUtils.division(a, b);
                    System.out.println("Division of the numbers: " + c);
                }
            }
            System.out.println("1. Continue \n" +
                    "2. Exit");
            System.out.print("Select: ");
            int x = scanner.nextInt();
            if (x == 2) {
                System.exit(0);
            }else if (x != 1) {
                System.out.println("There is not an option like that!");
                System.exit(0);
            }
        }
    }
}
