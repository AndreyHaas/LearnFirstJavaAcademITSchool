package Lecture.CourseObjectives;

/**
 * Created by Andreas Haas on 3/3/2018.
 */
public class MultipliTable {
    public static void main(String[] args) {
        System.out.printf("   * ||");
        for (int i = 1; i <= 10; i++)
            System.out.printf("%4d ", i);
        System.out.printf("%n=====||=================================================%n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d ||", i);
            for (int j = 1; j <= 10; j++)
                System.out.printf("%4d ", i * j);
            System.out.printf("%n");
        }
    }
}