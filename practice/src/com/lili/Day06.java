package com.lili;

import java.util.*;

public class Day06 {
    public static void main(String[] args) {
        // 方法①：接收3个int类型参数，求最大值并返回
        System.out.println(max(5, 8, 10));// 10

        // 方法②：接收List<Integer>类型的集合(均为正数)，求最大值并返回
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(4);
        list.add(18);
        System.out.println(max1(list));// 18

        // 方法③：接收List<Integer>类型的集合(正数负数均有)，把正数变为负数，负数变为正数，并返回
        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(-4);
        list1.add(2);
        list1.add(-9);
        System.out.println(fan(list1)); // [-7, 4, -2, 9]

        // 方法④：接收两个string类型的参数求和，并返回string类型
        String a = "4";
        String b = "6";
        System.out.println(add(a, b)); // 10

        // 方法⑤：判断是否为回文字符串（abccba 1234321）
        String str1 = "abccba";
        String str2 = "12342";
        System.out.println(judge(str1)); // true
        System.out.println(judge(str2)); // false

        // 方法⑥：接收list<Integer>集合求和，返回int类型
        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(2);
        list5.add(2);
        list5.add(4);
        System.out.println(sum(list5)); // 9

        // 方法⑦：接收一个List<Integer>的集合，把里面的所有偶数放到一个新的list集合中并返回
        System.out.println(ou(list5)); // [2, 2, 4]

        // 方法⑧：接收一个List<Integer>的集合，把里面重复的元素都去掉放到一个新的list集合中并返回
        System.out.println(chongfu(list5)); // [1, 2, 4]

        // 问题⑨：接收一个字符串，求出每个字符出现的次数，返回map
        String s = "abcdaaabcddtre";
        System.out.println(geshu(s)); // {a=4, b=2, r=1, c=2, d=3, t=1, e=1}
    }

    // 方法①：接收3个int类型参数，求最大值并返回
    //        用Math类求最大值（两两相比）
    public static int max(int a , int b, int c) {
        int i = Math.max(a,b);
        int j = Math.max(i,c);
        return j;
    }

    // 方法②：接收List<Integer>类型的集合(均为正数)，求最大值并返回
    //       设置一个变量k初始值为-1，用k和集合遍历值相比,并将较大值赋给k
    public static int max1(List<Integer> list) {
        int k = -1;
        for (int i = 0; i < list.size(); i++) {
            k = Math.max(k, list.get(i));
        }
        return k;
    }

    // 方法③：接收List<Integer>类型的集合(正数负数均有)，把正数变为负数，负数变为正数，并返回
    //        遍历：每个值都✖-1 给list重新赋值 set(索引值，值)
    public static List<Integer> fan(List<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
              list1.set(i,list1.get(i) * -1);
        }
        return list1;
    }

    // 方法④：接收两个string类型的参数求和，并返回string类型
    //        先变为int类型求和，再变为string类型返回
    public static String add(String a, String b) {
        // string变int方法：
       int o = Integer.parseInt(a);
       int u = Integer.parseInt(b);
       int c = o + u;
       // int变string方法：
       return String.valueOf(c);
    }

    // 方法⑤：判断是否为回文字符串（abccba 1234321）
    public static boolean judge(String str) {
        // 取到字符串长度
        int d = str.length();
        // 字符串变为字符数组
        char[] chars = str.toCharArray();
        // 定义开始索引为0和结束索引为长度-1
        int start = 0;
        int end = d - 1;
        // 当开始索引小于结束索引，就进到循环中去判断值是否相等
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 方法⑥：接收list<Integer>集合求和，返回int类型
    //      Integer类型和int类型可以直接互相转换，自动装箱自动拆箱
    //      list6为遍历出来的每一项
    public static int sum(List<Integer> list5) {
        int sum = 0;
        for (Integer list6 : list5) {
          sum += list6;
        }
        return sum;
    }

    // 方法⑦：接收一个List<Integer>的集合，把里面的所有偶数放到一个新的list集合中并返回
    public static List<Integer> ou(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    // 方法⑧：接收一个List<Integer>的集合，把里面重复的元素都去掉放到一个新的list集合中并返回
    public static List<Integer> chongfu(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    // 问题⑨：接收一个字符串，求出每个字符出现的次数，返回map
    public static Map<String,Integer> geshu(String s) {
        Map<String,Integer> map = new HashMap<>();
        // 把字符串变为字符数组去遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 把遍历到的每个值(key)交给一个char类型的变量
            char ch = chars[i];
            // 因为要求返回的键是string类型，所以需要把值从char类型变为string类型
            String key = String.valueOf(ch);
            // 判断map中是否包含这个键，若不包含，就put添加
            if (!map.containsKey(key)) {
               map.put(key,1);
            } else {
                // 若包含，就根据键找值，并给值进行＋1的操作，并重新put
                // map.get(key)：根据键找值
                Integer count = map.get(key);
                count += 1;
                map.put(key, count);
            }
        }
        return map;
    }
}
