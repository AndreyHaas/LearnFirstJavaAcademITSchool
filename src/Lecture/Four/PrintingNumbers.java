package Lecture.Four;

public class PrintingNumbers {
    public static void main(String[] args) {
        int i = 3;
        int sum = 0;
        int count = 0;

        while (i <= 21) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        int average = sum / count;
        System.out.printf("sum/count = %d/%d%n", sum, count);
        System.out.printf("average = %d", average);
    }
}
