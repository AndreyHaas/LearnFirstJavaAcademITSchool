package Lecture.Five;

import java.util.Scanner;

/**
 * Created by Andreas Haas on 3/2/2018.
 */
public class Break {
    public static void main(String[] args) {
        String secretText = "exit";
        String enteredValue;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите команду: ");
            enteredValue = scanner.nextLine();
            if (enteredValue.equals(secretText)) {
                break;
            }
        } while (!enteredValue.equals(secretText));
    }
}