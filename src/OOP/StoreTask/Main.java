package OOP.StoreTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String menu = "1. Add new product \n" +
                    "2. Remove product \n" +
                    "3. Search product \n" +
                    "4. Print all products \n" +
                    "5. Exit program";
            System.out.println(menu);
            System.out.print("Select an option: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1 -> {
                    Product product = new Product();
                    scanner.nextLine();
                    System.out.print("Product name: ");
                    product.name = scanner.nextLine();
                    System.out.print("Product price: ");
                    product.price = scanner.nextDouble();
                    System.out.print("Product code: ");
                    product.code = scanner.next();
                    System.out.print("Product quantity: ");
                    product.quantity = scanner.nextLong();
                    System.out.print("Product create date: ");
                    product.createDate = scanner.next();

                    Store.addProduct(product);
                }
                case 2 -> {
                    System.out.print("Please enter product number you want remove: ");
                    int a = scanner.nextInt();
                    Store.removeProduct(a);

                }
                case 3 -> {
                    System.out.print("Please enter product code you want to search: ");
                    String code = scanner.next();

                    StoreUtil.searchProduct(code);
                }
                case 4 -> StoreUtil.printProducts();
                case 5 -> System.exit(0);
            }
        }
    }
}
