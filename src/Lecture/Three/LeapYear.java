package Lecture.Three;

//лекция 3 страница 35

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 4 цифры года для проверки, является ли он високосным: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Введённый вами год - високосный.");
        } else {
            System.out.println("Введённый вами год - НЕ високосный.");
        }
    }
}
