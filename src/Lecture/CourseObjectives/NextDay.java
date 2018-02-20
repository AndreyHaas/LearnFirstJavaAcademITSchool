package Lecture.CourseObjectives;

/*
Задача из третьей лекции (страница 39)
 */

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        int last = 0;

        if (month == 2) {
            if ((year % 4) != 0 && day == 28) {
                last = 1;
            }
            if ((year % 4) == 0 && day == 29) {
                last = 1;
            }
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            month++;
            day = 0;
        } else if (day == 31) {
            last = 1;
        }
        if (last == 1) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else month++;
        } else day++;
        System.out.printf("Завтра будет: %02d.%02d.%d г.", day, month, year);
    }
}
