package Lecture.Three;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int digit = scanner.nextInt();

        if (digit > 0) {
            System.out.println("Введёное вами число положительное!");
        }
        if (digit % 2 == 0) {
            System.out.println("Введёное вами число чётное!");
        }
        if (digit % 5 == 0) {
            System.out.println("Введёное вами число кратно пяти!");
        }
    }
}