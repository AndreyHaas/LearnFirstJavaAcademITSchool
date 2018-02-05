package Lecture.Two;

import java.util.Locale;
import java.util.Scanner;

public class ReadFromConsoleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите длину стороны прямоугольника, см.: ");
        double length = scanner.nextDouble();

        System.out.println("Введите ширину стороны прямоугольника, см.: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Площадь прямоугольника равна: " + area + " кв.см.");
/*
В задаче про площадь прямоугольника вывести длину,
ширину и площадь прямоугольника при помощи одного
printf
* Вывести там же и периметр
*/
        double perimeter = 2 * (length + width);

        System.out.printf("Длина: %.2f см.%nШирина: %.2f см.%nПлощадь: %.2f кв.см.%nПериметр: %.2f см.%n", length, width, area, perimeter);
    }
}