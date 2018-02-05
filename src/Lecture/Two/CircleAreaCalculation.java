package Lecture.Two;

public class CircleAreaCalculation {
    public static void main(String[] args) {
        int radius = 40;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Площадь окружности при заданном радиусе равна: %.2f%n", area);
        System.out.printf("Длина окружности при заданном радиусе равна: %.2f%n", circumference);
    }
}
