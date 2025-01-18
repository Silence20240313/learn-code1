package com.lili;

import java.util.Arrays;

public class Day05 {
    public static void main(String[] args) {

        //
        StringBuilder sb = new StringBuilder();
        sb.append("java1");
        sb.append("java2");
        sb.append("java3");
        System.out.println(sb);

        System.out.println(sb.reverse());

        System.out.println(sb.length());

        //
        int a = 5;
        int b = 4;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.abs(a - b));

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int j = (i + 1) * 10;
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }
}
