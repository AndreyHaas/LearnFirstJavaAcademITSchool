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
        if (day < 1 || day > 31) {
            System.out.println("Введённая цифра не соответствует календарному дню. Повторите ввод дня корректно.");
            return;
        }

        System.out.println("Введите месяц от 1 до 12-ти:");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Введённая цифра не соответствует календарному месяцу. Повторите ввод месяца корректно.");
            return;
        }

        System.out.println("Введите год в четырёхзначном формате:");
        int year = scanner.nextInt();
        if (String.valueOf(Math.abs(year)).length() > 4) {
            System.out.println("Введённая цифра не соответствует требуемой длине. Повторите ввод года корректно.");
            return;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day < 30) {
            day++;
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day < 31) {
            day += 1;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            month++;
            day = 1;
        } else if (day == 31 && month != 12) {
            month++;
            day = 1;
        }

        if (month == 2) {
            if ((year % 4 != 0 && year % 100 == 0 && day == 28) || (year % 400 != 0)) {
                day++;
            }
        }

        if (month == 12 && day == 31) {
            day = 1;
            month = 1;
            year += 1;
        }

        System.out.printf("Завтра будет: %02d.%02d.%d г.", day, month, year);
    }
}