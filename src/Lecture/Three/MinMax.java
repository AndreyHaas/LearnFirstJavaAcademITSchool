package Lecture.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit1 = Integer.parseInt(reader.readLine());
        int digit2 = Integer.parseInt(reader.readLine());

        if (digit1 > digit2) {
            System.out.println("Ветвление (if-else):\nНаибольшее значение в введённой паре цифр: " + digit1 + ", соответственно " + digit2 + " - наименьшее.\n");
        } else {
            System.out.println("Ветвление (if-else):\nНаибольшее значение в введённой паре цифр: " + digit2 + ", соответственно " + digit1 + " - наименьшее.\n");
        }
        int max = (digit1 > digit2) ? digit1 : digit2;
        int min = (digit1 < digit2) ? digit1 : digit2;

        System.out.println("С применением тернарного оператора:\nМаксимальное значение: " + max + ", минимальное значение в связке: " + min);
    }
}
