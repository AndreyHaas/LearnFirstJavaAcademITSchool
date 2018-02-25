package Lecture.Four;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner command = new Scanner((System.in));

        System.out.println("Введите команду: ");
        String value = command.nextLine();

        switch (value) {
            case "print":
                System.out.println("Введите строку: ");
                String read = command.nextLine();
                System.out.println(read);
                break;
            case "sum":
                System.out.println("Введите вещественное число: ");
                double firstNumber = command.nextDouble();
                System.out.println("Введите вещественное число: ");
                double nextNumber = command.nextDouble();
                System.out.printf("Sum = %f", firstNumber + nextNumber);
                break;
            default:
                System.out.println("Unknown command.");
        }
    }
}
