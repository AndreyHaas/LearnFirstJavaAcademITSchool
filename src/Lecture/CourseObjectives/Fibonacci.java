package Lecture.CourseObjectives;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество итераций для расчёта числа Фибоначчи:");
        double fibonacciNumbers = scanner.nextDouble();

        double a = 0;
        double b = 0;
        double count;
        System.out.print("Ряд Фибоначчи равен: " + a);
        b += 1;
        System.out.print(", " + b);
        int i = 0;
        while (i < fibonacciNumbers) {
            count = a + b;
            a = b;
            b = count;
            System.out.print(", " + count);
            i++;
        }
    }
}
