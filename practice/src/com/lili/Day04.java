package com.lili;

import java.util.*;

public class Day04 {
    public static void main(String[] args) {

        try {
            System.out.println(chu(8, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(chu(8, 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int chu(int a,int b) {
        if (b == 0) {
            throw new BusinessException("パラメター不正" + b);
        }
        int c = a/b;
        return c;
    }
}
