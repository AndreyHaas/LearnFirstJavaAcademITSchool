package Lecture.CourseObjectives;

/*
Задача из третьей лекции (страница 36)
 */

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату x1 для первой вершины треугольника: ");
        double x1 = scanner.nextInt();
        System.out.println("Введите координату y1 для первой вершины треугольника: ");
        double y1 = scanner.nextInt();

        System.out.println("Введите значение x2 для второй вершины треугольника: ");
        double x2 = scanner.nextInt();
        System.out.println("Введите значение y2 для второй вершины треугольника: ");
        double y2 = scanner.nextInt();

        System.out.println("Введите значение x3 для третьей вершины треугольника: ");
        double x3 = scanner.nextInt();
        System.out.println("Введите значение y3 для третьей вершины треугольника: ");
        double y3 = scanner.nextInt();

        // прямой расчёт площади треугольника (без применения формулы Герона - работает
//        int area = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;

        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double p = (a + b + c) / 2;

        double area = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        if (area > 0) {
            System.out.println("Площадь треугольника равна " + area);
        } else {
            System.out.println("Заданные вершины лежат на одной прямой!!!" + " Площадь треугольника в данном случае не вычисляется!!!");
        }
    }
}