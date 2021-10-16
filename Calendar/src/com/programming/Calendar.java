package com.programming;

public class Calendar {

    public static void main(String[] args) {
        System.out.println(day(1, 10, 1999));
    }

    public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return d;
    }

}
