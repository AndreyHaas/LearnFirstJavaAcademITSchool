package Lecture.CourseObjectives;

/*
Задача из третьей лекции (страница 36)
 */

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        double x1, y1, x2, y2, x3, y3, area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату x1 для первой вершины треугольника: ");
        x1 = scanner.nextInt();
        System.out.println("Введите координату y1 для первой вершины треугольника: ");
        y1 = scanner.nextInt();

        System.out.println("Введите значение x2 для второй вершины треугольника: ");
        x2 = scanner.nextInt();
        System.out.println("Введите значение y2 для второй вершины треугольника: ");
        y2 = scanner.nextInt();

        System.out.println("Введите значение x3 для третьей вершины треугольника: ");
        x3 = scanner.nextInt();
        System.out.println("Введите значение y3 для третьей вершины треугольника: ");
        y3 = scanner.nextInt();

        area = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;

        if (area > 0) {
            System.out.println("Площадь треугольника равна " + area);
        } else {
            System.out.println("Заданные вершины лежат на одной прямой!!!" +
                    " Площадь треугольника в данном случае не вычисляется!!!");
        }
    }
}