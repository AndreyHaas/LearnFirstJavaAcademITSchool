package Lecture.Four;

public class DoWhileHome {
    public static void main(String[] args) {
        int beginNumber = 3;
        int stopNumber = 17;
        int sum = 0;
        int count = 0;
        int i = beginNumber;

        while (i <= stopNumber) {
            sum += i;
            ++i;
            ++count;
        }


        double average = (double) sum / count;

        System.out.println("average = " + average);
    }
}
