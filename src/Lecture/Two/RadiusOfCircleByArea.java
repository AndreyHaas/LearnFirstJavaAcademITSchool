package Lecture.Two;

public class RadiusOfCircleByArea {
    public static void main(String[] args) {

        int area = 570;
        double radius = Math.sqrt(area) / Math.PI;

        int angle = 45;
        double area1 = Math.PI * Math.pow(radius, 2) * angle / 360;

        System.out.println("Радиус окружности для заданной площади составит: " + radius);
        System.out.println("Площадь сектора с заданным радиусом составит: "+ area1);
    }
}