package Lecture.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsoleBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину стороны прямоугольника, см.: ");
        double length = Double.parseDouble(reader.readLine());

        System.out.println("Введите ширину стороны прямоугольника, см.: ");
        double width = Double.parseDouble(reader.readLine());

        double area = length * width;

        System.out.println("Площадь прямоугольника равна: " + area + " кв.см.");
    }
}