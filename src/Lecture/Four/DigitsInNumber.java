package Lecture.Four;

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int enteredNumber, sum = 0;
        int digit;
        int odd = 0;
        int maxDigit=0;
        if (scanner.hasNextInt()) {
            System.out.println("Введите целое число: ");
            enteredNumber = scanner.nextInt();

            while (enteredNumber != 0) {
                digit = enteredNumber % 10;
                if (digit > maxDigit) {
                    maxDigit = digit ;
                }
                if (digit % 2 != 0) {
                    odd += digit;
                }
                sum = sum + enteredNumber % 10;
                enteredNumber /= 10;
            }
            System.out.println("Сумма цифр введенного числа равна " + sum);
            System.out.println("Сумма нечетных цифр в числе составит: " + odd);
            System.out.println("Максимальная цифра в числе: " + maxDigit);
        } else {
            System.out.println("Ошибка ввода!!! Вами введено не число!!!");
            {
            }
        }
    }
}

