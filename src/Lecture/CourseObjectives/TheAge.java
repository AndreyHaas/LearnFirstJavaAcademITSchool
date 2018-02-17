package Lecture.CourseObjectives;

/*
Задача из третьей лекции (страница 37)
 */

import java.util.Scanner;

public class TheAge {
    public static void main(String[] args) {
        String ageDescription;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст в диапазоне от 1 до 112: ");
        int age = scanner.nextInt();

        if (age == 1 || age == 21 || age == 31 || age == 41 || age == 51 || age == 61 || age == 71 || age == 81 || age == 91 || age == 101) {
            ageDescription = "год.";
        } else if (
                age >= 2 && age <= 4    || age >= 22 && age <= 24   || age >= 32 && age <= 34 || age >= 42 && age <= 44 ||
                age >= 52 && age <= 54  || age >= 62 && age <= 64   || age >= 72 && age <= 74 || age >= 82 && age <= 84 ||
                age >= 92 && age <= 94  || age >= 102 && age <= 104)
        {
            ageDescription = "года.";
        } else {
            ageDescription = "лет.";
        }

        if (age >= 1 && age <= 112) {
            System.out.println("Вам " + age + " " + ageDescription);
        } else if (age < 1) {
            System.out.println("Вы слишком малы.");
        } else {
            System.out.println("Вы слишком стары.");
        }
    }
}
