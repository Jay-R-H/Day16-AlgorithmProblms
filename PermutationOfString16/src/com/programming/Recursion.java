package com.programming;

public class Recursion {

    public String swap(String word, int pos1, int pos2) {
        char temp;
        char[] charArray = word.toCharArray();
        temp = charArray[pos1];
        charArray[pos1] = charArray[pos2];
        charArray[pos2] = temp;
        return String.valueOf(charArray);
    }

    public void permutation(String word, int start, int end) {
        if (start == end) {
            System.out.println(word);
        } else {
            for (int i = start; i < end; i++) {
                word = swap(word, start, i);
                permutation(word, start + 1, end);
                word = swap(word, start, i);
            }
        }
    }

    public static void main(String[] args) {
        String word = "EAT";
        int lengthOfWord = word.length();
        Recursion recursion = new Recursion();
        recursion.permutation(word, 0, lengthOfWord);
    }
}
