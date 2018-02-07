package Lecture.Three;

import java.util.Scanner;

public class Conversations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        if (digit > 0) {
            System.out.println("Введённое число ПОЛОЖИТЕЛЬНОЕ.");
        } else if (digit == 0) {
            System.out.println("Введённое число РАВНО НУЛЮ.");
        } else {
            System.out.println("Введённое число отрицательное.");
        }
    }
}
