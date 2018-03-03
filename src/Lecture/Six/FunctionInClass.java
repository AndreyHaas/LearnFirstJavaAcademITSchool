package Lecture.Six;

/**
 * Created by Andreas Haas on 3/3/2018.
 */
public class FunctionInClass {
    public static int calc3xPlus4y(int x, int y) {
        return 3 * x + 4 * y;
    }

    public static double getAverage(int begin, int end) {
        int sum = 0;
        int count = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
            ++count;
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        System.out.println(calc3xPlus4y(6, 8));
        System.out.println(calc3xPlus4y(3, 2));
        System.out.println(calc3xPlus4y(11, 13));
        System.out.println(getAverage(3, 10));
    }
}
