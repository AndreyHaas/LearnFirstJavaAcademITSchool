package Lecture.Four;

public class NumbersInRow {
    public static void main(String[] args) {
        int firstNumber = 1;
        int stopNumber = 100;
        int amountInLine = 10;

        while (firstNumber <= stopNumber) {
            System.out.printf("%10d", firstNumber);
            firstNumber++;
            if (firstNumber % amountInLine == 0) {
                System.out.println();
            }
        }
    }
}
