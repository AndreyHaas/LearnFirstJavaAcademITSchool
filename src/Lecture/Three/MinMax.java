package Lecture.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        if (number1 > number2) {
            System.out.println("Ветвление (if-else):");
            System.out.println("Наибольшее значение в введённой паре цифр: " + number1 + " а, "+ number2 + " - наименьшее.");
        } else {
            System.out.println("Ветвление (if-else):");
            System.out.println("Наибольшее значение в введённой паре цифр: " + number2 + " а, "+ number1 + " - наименьшее.");
        }
        int max = (number1 > number2) ? number1 : number2;
        int min = (number1 < number2) ? number1 : number2;

        System.out.println("С применением тернарного оператора:");
        System.out.println("Максимальное значение: " + max + ", минимальное значение в связке: " + min);
    }
}
