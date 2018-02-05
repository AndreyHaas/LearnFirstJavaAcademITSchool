package Lecture.Two;

public class BodyMassIndex {
    public static void main(String[] args) {
        int weight = 65;
        double height = 1.74;
        double imt = weight / Math.pow(height, 2);

        System.out.println("Индекс массы тела составляет: " + imt);
    }
}
