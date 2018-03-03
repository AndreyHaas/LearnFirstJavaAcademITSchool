package Lecture.Five;

/**
 * Created by Andreas Haas on 3/3/2018.
 */
public class Learn {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5) {
                continue;
            }
            if (i % 3 == 0) {
                continue;
            }
            if (i >= 60 && i <= 80) {
                continue;
            }
            System.out.println(i);
        }

        int i = 0;
        while (i <= 100) {
            if (i == 5) {
                i++;
                continue;
            }
            if (i % 3 == 0) {
                i++;
                continue;
            }
            if (i >= 60 && i <= 80) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
