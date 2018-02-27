package Lecture.Four;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Введите команду: ");
        String str = scanner.nextLine();

        switch (str) {
            case "print":
                System.out.println("Введите строку: ");
                String read = scanner.nextLine();
                System.out.println(read);
                break;
            case "sum":
                System.out.println("Введите вещественное число: ");
                double firstNumber = scanner.nextDouble();
                System.out.println("Введите вещественное число: ");
                double nextNumber = scanner.nextDouble();
                System.out.printf("Sum = %f", firstNumber + nextNumber);
                break;
            default:
                System.out.println("Unknown command.");
        }
    }
}
