package com.programming;

public class BubbleSortAlg {

    static void bubbleSort(int[] array, int n) {
        int i;
        int j;
        int temp;
        boolean flag;
        for (i = 0; i < n - 1; i++) {
            flag = false;
            for (j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                break;
        }
    }

    static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 32, 5, 11, 42, 41, 20};
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
