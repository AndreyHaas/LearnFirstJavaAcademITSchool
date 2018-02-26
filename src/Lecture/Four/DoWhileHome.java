package Lecture.Four;

public class DoWhileHome {
    public static void main(String[] args) {
        int beginNumber = 1;
        int stopNumber = 20;
        int sum = 0;
        int count = 0;

        do {
            sum += count;
            count++;
        } while (count <= stopNumber);
        System.out.println("average = " + sum / count);
    }
}
