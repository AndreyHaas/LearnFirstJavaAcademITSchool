package Lecture.Two;

public class CircleAreaCalculation {
    public static void main(String[] args) {
        int radius = 40;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Площадь окружности при заданном радиусе равна: " + area);
        System.out.println("Длина окружности при заданном радиусе равна: " + circumference);
    }
}
