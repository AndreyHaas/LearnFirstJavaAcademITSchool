package Lecture.CourseObjectives;

/**
 * Created by Andreas Haas on 3/3/2018.
 */
public class EuclidsAlgorithm {
    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int stuff = a % b;
            a = b;
            b = stuff;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(15,20));
    }
}