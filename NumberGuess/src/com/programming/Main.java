package com.programming;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the upper limit for the range of numbers: ");
        int n = scanner.nextInt();

        int upperLimit = (int) Math.pow(2, n);

        System.out.println("Think of a number between 0 and " + (upperLimit-1));
        int number = scanner.nextInt();

        searchNumber(upperLimit);

    }

    public static void searchNumber(int upperLimit) {
        int low = 0;
        int high = upperLimit - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            System.out.println("Enter 0 if the number is " + mid);
            System.out.println("Enter 1 if the number is in between " + low + " and " + mid);
            System.out.println("Enter 2 if the number is in between " + (mid + 1) + " and " + high);
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Got your number ! the number is " + mid);
                break;
            } else if (choice == 1) {
                high = mid;
            } else if (choice == 2) {
                low = mid + 1;
            } else {
                System.out.println("Choose a right option");
            }
        }
    }
}
