package com.programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int number = 0;
    public static int limit = 1000;

    static void checkForPrime() {
        while (number <= 1000) {
            int flag = 0;
            number++;
            int m;
            m = number / 2;
            if (number == 0 || number == 1) {
                System.out.println(number + " is not prime number");
            } else {
                for (int i = 2; i <= m; i++) {
                    if (number % i == 0) {
                        System.out.println(number + " is not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(number + " is a prime number");
                }
            }
        }
    }

    public static void main(String[] args) {
        checkForPrime();
    }
}