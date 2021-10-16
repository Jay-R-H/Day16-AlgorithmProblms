package com.programming;

public class Main {

    public static int number = 0;
    public static int limit = 1000;

    public static void main(String[] args) {
        checkForPrime();
    }

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
                    System.out.print(number + " is a prime number ");
                    palindromeCheck(number);
                }
            }
        }
    }

    static void palindromeCheck(int number) {
        int temp = number;
        int r;
        int sum = 0;
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum)
            System.out.println(" and a palindrome number ");
        else
            System.out.println("but not a palindrome number ");
    }



}
