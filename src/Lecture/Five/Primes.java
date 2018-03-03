package Lecture.Five;

import java.util.Scanner;

/**
 * Created by Andreas Haas on 3/3/2018.
 */
public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите верхний предел расчёта простых чисел: ");
        int enteredNumber = scanner.nextInt();

        int i, j;
        boolean isPrime;

        for (i = 2; i <= enteredNumber; i++) {
            isPrime = true;

            for (j = 2; j < (i / j); j++) {
                if ((i % j) == 0) isPrime = false;
            }

            if (isPrime) {
                System.out.println(i + " is prime");
            }
        }
    }
}
