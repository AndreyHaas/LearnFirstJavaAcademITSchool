package Lecture.Four;

import java.util.Scanner;

public class SwitchCaseHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый операнд:");
        int operandOne = scanner.nextInt();

        System.out.println("Введите второй операнд:");
        int operandTwo = scanner.nextInt();

        System.out.println("Введите номер команды от 1-го до 4-х:");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                System.out.printf("Сумма операндов составит: %d", operandOne + operandTwo);
                break;
            case 2:
                System.out.printf("Разность операндов составит: %d", operandOne - operandTwo);
                break;
            case 3:
                System.out.printf("Произведение операндов составит: %d", operandOne * operandTwo);
                break;
            case 4:
                System.out.printf("Результат деления операндов составит: %d", operandOne / operandTwo);
                break;
            default:
                System.out.print("Неизвестная операция.");
        }
    }
}
