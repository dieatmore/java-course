package com.experient01;

public class LeapYearsTest {
    public static void main(String[] args) {
        test(1899, 2046);
    }
    private static void test(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 !=0))
                System.out.println(i);
        }
    }
}
