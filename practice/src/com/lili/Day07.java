package com.lili;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day07 {
    public static void main(String[] args) {
        // メソッドは文字列のパラメーターを受け取って、その文字列の頭一文字を返却する
        String s = "abcdertdccd";
        String s1 = "汪苏泷";
        char c = 'd';
        System.out.println(getFirstChar(s));

        // メソッドは文字列のパラメーターを受け取って、その文字列の最後の一文字を返却する
        System.out.println(getLastChar(s));

        // メソッドはある文字列と文字を受けとって、文字は文字列の中で最初のインデックスを返却する
        System.out.println(getFirstIndex(s, c));

        // メソッドはある文字列と文字を受けとって、文字は文字列の中で最後のインデックスを返却する
        System.out.println(getLastIndex(s, c));

        // メソッドは文字列のパラメーターを受け取って、順番を変更して返却する
        System.out.println(reverseString(s1));

        // メソッドは数字のパラメーターを受け取って、絶対値を返却する
        int i = -5;
        int j = 6;
        int k = 0;
        System.out.println(getAbs(i));
        System.out.println(getAbs(j));
        System.out.println(getAbs(k));

        // メソッドは二つの数字を受け取って、一番大きい数字を返却する
        System.out.println(getMax(8, 3));
        System.out.println(getMax(5, 5));
        System.out.println(getMax(2, 9));

        // メソッドは二つの数字を受け取って、一番小さい数字を返却する
        System.out.println(getMin(2, 5));
        System.out.println(getMin(4, 4));
        System.out.println(getMin(9, 3));

        // メソッドは数字を受け取って、平方根を返却する
        System.out.println(getHeiPouKon(2));

        // メソッドは数字を受け取って、立方根を返却する
        System.out.println(getRiPouKon(5));

        // メソッドは数字を受け取って、階乗を返却する
        System.out.println(getKaiJou(4));

        // メソッドはリストを受け取って、リスト中の偶数を返却する
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-99);
        list.add(6);
        list.add(8);
        list.add(100);
        System.out.println(getEven(list));

        // メソッドはリストを受け取って、リスト中の一番大きい数字を返却する
        System.out.println(getMax2(list));

        // メソッドは二つのリストを受け取って、リスト中の同じ数字の合計値を返却する
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(8);
        list1.add(1);
        System.out.println(list1); // [2, 5, 8, 1]
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(1);
        list2.add(2);
        System.out.println(list2); // [4, 1, 2]
        System.out.println(getSum(list1, list2));

        // 接收一个字符串，判断是否是回文字符串
        String str1 = "汪苏泷";
        String str2 = "12321";
        System.out.println(judge(str1));
        System.out.println(judge(str2));

    }

    // 方法1：接收一个字符串，返回它的第一个字符
    public static char getFirstChar(String s) {
        return s.charAt(0);
    }

    // 方法2：接收一个字符串，返回它的最后一个字符
    public static char getLastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    // 方法3：接收一个字符串，一个字符，返回这个字符在字符串中第一次出现的索引
    public static int getFirstIndex(String s, char c) {
        int index = s.indexOf(c);
        return index;
    }

    // 方法4：接收一个字符串，一个字符，返回这个字符在字符串中最后一次出现的索引
    public static int getLastIndex(String s, char c) {
        int index = s.lastIndexOf(c);
        return index;
    }

    // 方法5：接收一个字符串，翻转后返回
    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    // 方法6：接收一个整数，获取绝对值
    public static int getAbs(int i) {
        if (i < 0) {
            i = i * -1;
        }
        return i;
    }

    // 方法7：接收两个整数，返回较大值
    public static int getMax(int a, int b) {
        if (a > b) {
           return a;
        }
        return b;
    }

    // 方法8：接收两个整数，返回较小值
    public static int getMin(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    // 方法9：接收一个整数，获取他的平方根
    public static int getHeiPouKon(int a) {
        a = a * a;
        return a;
    }

    // 方法10：接收一个整数，获取他的立方根
    public static int getRiPouKon(int a) {
        a = a * a * a;
        return a;
    }

    // 方法11：接收一个整数，获取他的阶乘
    public static int getKaiJou(int a) {
        int result = 1;
        for (int i = 1; i <= a ; i++) {
            result = result * i;
        }
        return result;
    }

    // 方法12：接收一个List，返回其中的偶数到一个新的List中
    public static List<Integer> getEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for(Integer num : list) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    // 方法13：接收一个List，返回其中最大的一个数（List中最小的数为-100）
    public static int getMax2(List<Integer> list) {
        int result = -101;
        for (Integer num : list) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    // 方法14：接收两个List，查看两个List中共有的交集数字，返回相加的和
    public static int getSum(List<Integer> list1, List<Integer> list2) {
        int result = 0;
        for (Integer num : list1) {
            if (list2.contains(num)) {
                result += num;
            }
        }
        return result;
    }

    // 方法15：接收一个字符串，判断是否是回文字符串
    public static boolean judge(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
