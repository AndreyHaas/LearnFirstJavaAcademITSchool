package Lecture.CourseObjectives;

/*
Задача из третьей лекции (страница 37)
 */

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст в диапазоне от 1 до 112: ");
        int age = scanner.nextInt();

        int ageLastNumber = age % 10;

        if (age < 1) {
            System.out.println("Вы слишком малы.");
            return;
        } else if (age > 112) {
            System.out.println("Вы слишком стары.");
            return;
        }

        boolean isExclusion = age % 100 >= 11 && age % 100 <= 14;
        String old = "";

        if (isExclusion || ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9) {
            old = "лет";
        } else if (ageLastNumber == 1) {
            old = "год";
        } else if (ageLastNumber >= 2 && ageLastNumber <= 4) {
            old = "года";
        }

        System.out.println("Вам " + age + " " + old);
    }
}
