package Lecture.Three;

import java.util.Scanner;

public class WorkingWithThePassword {
    public static void main(String[] args) {
        String pswd = "q1w2e3r4t5";

        Scanner scanner = new Scanner(System.in);
        String pswd1 = scanner.nextLine();

        if (pswd.equals(pswd1)) {
            System.out.println("Верный пароль.");
        } else if (pswd.length() < pswd1.length() && !pswd.equals(pswd1)) {
            System.out.println("Пароль неверный и строка слишком длинная.");
        } else if (pswd.length() > pswd1.length() && !pswd1.equals(pswd)) {
            System.out.println("Пароль неверный и строка слишком короткая.");
        } else {
            System.out.println("Пароль неверный.");
        }
    }
}
