package com.experiment01;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] s = {8, 3, 4, 22, 1};
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] > s[j]) {
                    int temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (int i : s) {
            System.out.println(i);
        }
    }
}
