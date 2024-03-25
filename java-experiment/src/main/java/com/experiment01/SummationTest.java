package com.experiment01;

public class SummationTest {
    public static void main(String[] args) {
        //数字
        int a = 3;
        int result = 0;
        int m = 0;
        //循环次数
        int repeat = 4;
        for (int i = 0; i < repeat; i++) {
            m += a * Math.pow(10,i);
            result += m;
        }
        System.out.println(result);
    }
}
