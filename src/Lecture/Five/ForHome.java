package Lecture.Five;

public class ForHome {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        for (int i = 0; i <= 5; i++) {
            System.out.println(Math.pow(i, 2));
        }
        System.out.println();

        int sum = 0;
        int count = 0;
        double amount;
        for (int i = 15; i >= 0; i--) {
            sum += i;
            count++;
        }

        amount = (double) sum / count;
        System.out.println(amount);

        for (int i = 1; i <= 100; i++) {
            if (i >= 30) {
                break;
            }
            System.out.println(i);
        }

        System.out.println();




        int i = 0;
        while (i <= 100) {
            if (i == 5) {
                ++i;
                continue;
            }
//            ++i;
        }
    }
}