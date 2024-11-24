package OOP.CounterTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.next();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        Person person1 = new Person(name, age);
        Person person2 = new Person(name, age);
        Person person3 = new Person(name, age);
        Person person4 = new Person(name, age);
        Person person5 = new Person(name, age);

        System.out.println("Count of objects: "+ Person.counter);
    }
}
