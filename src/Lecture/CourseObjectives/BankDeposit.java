package Lecture.CourseObjectives;

/**
 * Created by Andreas Haas on 3/4/2018.
 */
public class BankDeposit {
    public static double depositCalculation(int month, double interestRate, double depositValue) {
        double profitPerMonth;
        double totalProfit = 0;
        int monthInYear = 12;
        double interestRatePerMonth = interestRate / monthInYear / 100;
        for (int i = 0; i <= month; i++) {
            profitPerMonth = depositValue * interestRatePerMonth;
            depositValue += profitPerMonth;
            totalProfit += profitPerMonth;
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        System.out.printf("Прибыль по заданным условиям вклада составит: %.2f",
                depositCalculation(12, 10.0, 1000000.0));
    }
}