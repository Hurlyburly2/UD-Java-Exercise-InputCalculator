package com.dsimon;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                break;
            }
            sum += scanner.nextInt();
            count += 1;

        }

        double average = (double) sum / count;
        long roundedAverage = Math.round(average);
        System.out.println("SUM = " + sum + " AVG = " + roundedAverage);
        scanner.close();
    }

}
