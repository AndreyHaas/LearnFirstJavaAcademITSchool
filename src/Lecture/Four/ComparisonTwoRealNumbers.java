package Lecture.Four;

import java.util.Scanner;

public class ComparisonTwoRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое вещественное число: ");
        double realNumberOne = scanner.nextDouble();

        System.out.println("Введите второе вещественное число: ");
        double realNumberTwo = scanner.nextDouble();

        if (realNumberOne - realNumberTwo == 0) {
            System.out.println("Введённые вещественные числа равны.");
        } else {
            System.out.println("Введённые вещественные числа не равны.");
        }
    }
}
