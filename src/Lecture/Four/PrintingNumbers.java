package Lecture.Four;

public class PrintingNumbers {
    public static void main(String[] args) {
        int beginNumber = 3;
        int sum = 0;
        int count = 0;
        while (beginNumber <= 21) {
            if (beginNumber % 2 == 0) {
                sum += beginNumber;
                count++;
            }
            beginNumber++;
        }
        System.out.printf("sum/count = %d/%d", sum, count);
        System.out.println();
        System.out.printf("average = %d", sum / count);
    }
}
