package Lecture.Four;

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, count = 0;
        int odd = 0;

        if (scanner.hasNextInt()) {
            System.out.println("Введите целое число: ");
            a = scanner.nextInt();

            while (a != 0) {
                count = count + a % 10;
                a /= 10;
            }
            System.out.println("Сумма цифр введенного числа равна " + count);
        } else {
            System.out.println("Ошибка ввода!!! Вами введено не число!!!");
        }
    }
}

