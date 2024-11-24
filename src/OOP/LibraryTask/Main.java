package OOP.LibraryTask;

import java.util.Scanner;

import static OOP.LibraryTask.Book.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Book book = new Book();
            String menu = "1. Add a new book \n" +
                    "2. Remove a book \n" +
                    "3. Update a book \n" +
                    "4. Search a book \n" +
                    "5. Print all books \n" +
                    "6. Exit program";
            System.out.println(menu);
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.print("Please enter the title of book: ");
                    book.title = scanner.nextLine();
                    System.out.print("Please enter the author of book: ");
                    book.author = scanner.nextLine();
                    System.out.print("Please enter the price of book: ");
                    book.price = scanner.nextDouble();
                    Book.newBook(book);
                }
                case 2 -> {
                    Book.removeBook(5);
                    if (Book.x == 0) {
                        System.out.println("---------------------------------------");
                        System.out.println("There is no book to remove!");
                        System.out.println("---------------------------------------");
                    }else {
                        System.out.print("Please enter the number of book you want to remove: ");
                        int a = scanner.nextInt();
                        Book.removeBook(a);
                    }
                }
                case 3 -> Book.updateBook(books);
                case 4 -> {
                    scanner.nextLine();
                    System.out.print("Please enter the title of book: ");
                    String title = scanner.nextLine();
                    Book.searchBook(title);
                }
                case 5 -> Book.printAllBooks(books);
                case 6 -> System.exit(0);
            }
        }
    }
}
