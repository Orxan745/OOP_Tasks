package OOP.LibraryTask;

import java.util.Scanner;

public class Book {

    public String title;

    public String author;

    public double price;

    public static Book[] books = new Book[10];

    public static int a = 10;

    public static int bookCount = 0;

    public static int x;

    public static void printAllBooks(Book[] books) {
        if (books[0] == null) {
            System.out.println("---------------------------------------");
            System.out.println("There is no book to print!");
            System.out.println("---------------------------------------");
        } else {
            System.out.println("---------------------------------------");
            for (int i = 0; i < bookCount; i++) {
                Book book = books[i];
                if (book != null) {
                    System.out.println((i + 1) + "-ci book: " + book.title);
                }
            }
            System.out.println("---------------------------------------");
        }
    }

    public static void searchBook(String title) {
        System.out.println("---------------------------------------");
        for (int i = 0; i < bookCount; i++) {
            if (title.equals(books[i].title)) {
                System.out.println("Book title: " + books[i].title);
                System.out.println("Book author: " + books[i].author);
                System.out.println("Book price: " + books[i].price);
            }else {
                System.out.println("There is not a book like that in Library!");
            }
        }
        System.out.println("---------------------------------------");
    }

    public static void updateBook(Book[] books) {
        if (books[0] == null) {
            System.out.println("---------------------------------------");
            System.out.println("There is no book to update!");
            System.out.println("---------------------------------------");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select the number of the book that will be updated: ");
            int a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Please enter the new title: ");
            books[a - 1].title = scanner.nextLine();
            System.out.print("Please enter the new author: ");
            books[a - 1].author = scanner.nextLine();
            System.out.print("Please enter the new price: ");
            books[a - 1].price = scanner.nextDouble();
        }
    }

    public static void newBook(Book book) {int percentage = (bookCount/a)*100;
        if (percentage >= 80){
            Book[] books1 = new Book[a*2];
            a = a*2;
            for (int i = 0; i < bookCount; i++) {
                books1[i] = books[i];
            }
            books = books1;
        }
        books[bookCount] = book;
        bookCount++;
    }

    public static void removeBook(int a) {
        if (books[0] == null) {
            x = 0;
        }else {
            x = 1;
            books[a - 1] = null;
            for (int i = 0; i < bookCount - 1; i++) {
                Book book = books[a - 1];
                books[a - 1 + i] = books[a + i];
                books[a + i] = book;
            }
        }
    }
}
