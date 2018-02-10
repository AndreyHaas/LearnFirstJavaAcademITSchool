package Lecture.Three;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String currentPass = "q1w2e3r4t5";

        Scanner scanner = new Scanner(System.in);
        String inputPass = scanner.nextLine();

        if (currentPass.equals(inputPass)) {
            System.out.println("Верный пароль.");
        } else if (currentPass.length() < inputPass.length()) {
            System.out.println("Пароль не верный и строка слишком длинная.");
        } else if (currentPass.length() > inputPass.length()) {
            System.out.println("Пароль не верный и строка слишком короткая.");
        } else {
            System.out.println("Пароль не верный.");
        }
    }
}
