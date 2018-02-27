package Lecture.CourseObjectives;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество итераций для расчёта числа Фибоначчи:");
        int fibonacciNumbers = scanner.nextInt();

        int a = 0;
        int b = 0;
        a += 1;
        b += 1;
        System.out.print("Ряд Фибоначчи равен: " + a + " " + b);

        int count, i = 2;
        while (i < fibonacciNumbers) {
            count = a + b;
            a = b;
            b = count;
            System.out.print(" " + count);
            i++;
        }
    }
}
