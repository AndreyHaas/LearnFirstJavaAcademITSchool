package Lecture.Two;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String firstName = scanner.nextLine();

        System.out.println("Введите вашу фамилию: ");
        String surname = scanner.nextLine();

        System.out.println("Добро пожаловать на курсы Academ IT School, " + surname + " " + firstName + ".");
    }
}