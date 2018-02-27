package Lecture.Four;

public class PrintingNumbers {
    public static void main(String[] args) {
        int beginNumber = 0;
        int numberWithDelta = 3;
        int sum = 0;
        int count = 0;
        beginNumber += numberWithDelta;
        while (beginNumber <= 21) {
            if (beginNumber % 2 == 0) {
                sum += beginNumber;
                count++;
            }
            beginNumber++;
        }
        int average = sum / count;
        System.out.printf("sum/count = %d/%d%n", sum, count);
        System.out.printf("average = %d", average);
    }
}
