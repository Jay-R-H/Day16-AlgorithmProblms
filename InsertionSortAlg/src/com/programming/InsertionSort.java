package com.programming;

public class InsertionSort {

    public void sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int marker = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > marker) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = marker;
        }
    }

     static void printArray(int[] array) {
        for (int i=1;i< array.length;i++){
            System.out.print(array[i]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {4,3,1,7,9,5,2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);
        insertionSort.printArray(array);

    }
}
