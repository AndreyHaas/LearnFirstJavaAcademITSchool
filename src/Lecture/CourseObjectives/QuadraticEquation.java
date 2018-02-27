package Lecture.CourseObjectives;

/*
Задача из третьей лекции (страница 38)
 */

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение переменной \"А\":");
        int a = scanner.nextInt();

        System.out.println("Введите значение переменной \"В\":");
        int b = scanner.nextInt();

        System.out.println("Введите значение переменной \"C\":");
        int c = scanner.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("Нет решения для уравнения!");
        } else if (d == 0) {
            double x1 = -b / 2 * a;
            System.out.println("Уравнение имеет один корень:");
            System.out.println("x1 = " + x1);
        } else {
            double x1 = -b + Math.sqrt(d) / 2 * a;
            double x2 = -b - Math.sqrt(d) / 2 * a;
            System.out.println("Уравнение имеет два корня:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}