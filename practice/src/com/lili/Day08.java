package com.lili;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day08 {
    public static void main(String[] args) {
       // メソッドは文字列を受け取って、文字列中の文字と頻度をマップにいれって、返却する
        String s = "136653315";
        System.out.println(getWordTimes(s));

        // メソッドは配列を受け取って、配列の中の数字と頻度を返却する
        int[] age = {18,22,31,18,25};
        System.out.println(getIntTimes(age));

        // メソッドは配列を受け取って、重複の数字を削除して、返却する
        int[] num = {66,88,52,99,88,66};
        System.out.println(getUnique(num));

        // メソッドはリストを受け取って、マップ、、返却する
        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("cd");
        list.add("ef");
        list.add("ge");
        System.out.println(get(list));

        //
        List<String> list1 = new ArrayList<>();
        list1.add("汪苏泷");
        list1.add("北京");
        list1.add("大象音乐");
        list1.add("十万伏特演唱会");
        System.out.println(getG(list1));

        //
        List<Person> list2 = new ArrayList<>();
        Person p1 = new Person("zz","1b");
        Person p2 = new Person("jj","1b");
        Person p3 = new Person("dd","3b");
        list2.add(p1);
        list2.add(p2);
        list2.add(p3);


    }

    public static Map<Character,Integer> getWordTimes(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (!map.containsKey(key)){
                map.put(key,1);
            }else {
                Integer value  = map.get(key);
                value += 1;
                map.put(key,value);
            }
        }
        return map;
    }

    public static Map<Integer,Integer> getIntTimes(int[] age) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int key : age){
            if (!map.containsKey(key)){
                map.put(key,1);
            }else {
                int value = map.get(key);
                value += 1;
                map.put(key,value);
            }
        }
        return map;
    }

    public static List<Integer> getUnique(int[] n) {
        List<Integer> list = new ArrayList<>();
        for (int num : n) {
            if (list.contains(num)){
                continue;
            }else {
                list.add(num);
            }
        }
        return list;
    }

    public static Map<String,String> get(List<String> list) {
        Map<String,String> map = new HashMap<>();
        for (String key : list) {
            // 2. 翻转key 赋值给value
            String value = "";
            for (int i = key.length()-1; i >= 0 ; i--) {
               // b a
                value = value + key.charAt(i);
            }
            map.put(key, value);
        }
        return map;
    }

    public static Map<String,Integer> getG(List<String> list) {
        Map<String,Integer> map = new HashMap<>();
        for (String key : list) {
            int value = key.length();
            map.put(key,value);
        }
        return map;
    }

    public static Map<String,List<String>> getJ(List<Person> list) {
        Map<String,List<String>> map = new HashMap<>();
        /**
         *
         * list: [
         *
         *
         *  {dd, 3b}
         * ]
         *  map+
         */
        // 1. Traverse list to get name and class
        for (Person person : list) {
            // 2. Get name & class  {jj, 1b},
            String name = person.getName(); // jj
            String className = person.getClassName(); // 1b

            if (map.containsKey(className)) {
                List<String> classMatesList = map.get(className);
                classMatesList.add(name); // [zz, jj]
            } else {
                List<String> classMatesList = new ArrayList<>();
                classMatesList.add(name);

                // 1b, [zz]
                map.put(className, classMatesList);
            }
        }

        return map;
    }


}