package com.lili;

import java.util.*;

public class Day03 {
    public static void main(String[] args) {
        // 循环遍历添加元素
        Collection<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("java" + (i + 1));
        }
        System.out.println(list);

        // 清空
        list.clear();
        System.out.println(list);

        // 是否为空
        if (list.isEmpty()) {
            System.out.println("このリストがからです");
        } else {
            System.out.println("このリストがからではない");
        }

        // 234
        for (int i = 0; i < 3; i++) {
            list.add("java" + (i + 2));
        }
        System.out.println(list);

        System.out.println(list.size());

        //
        Collection<String> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);

        //
        if (list1.contains("java3")) {
            System.out.println("このリストは対象の文字列があります");
        } else {
            System.out.println("このリストは対象の文字列がありません");
        }

        list1.remove("java3");
        System.out.println(list1.contains("java3"));

        //
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String lists : list) {
            System.out.println(lists);
        }

        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);

        list2.add(2,"蜘蛛精");
        System.out.println(list2);

        list2.set(0,"牛魔王");
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        list2.forEach(v -> {
            System.out.println(v);
        });

        //
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list3.add(i+1);
        }
        System.out.println(list3);

        //
        Collections.shuffle(list3);
        System.out.println(list3);

        Collections.sort(list3);
        System.out.println(list3);


        // map

        Map<Integer,String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int j = (i+1)*100;
            map.put(j,"腕時計"+j);
        }
        System.out.println(map);

        System.out.println(map.size());

        map.remove(300);
        System.out.println(map.containsKey(300));
        System.out.println(map.containsKey(500));

        System.out.println(map.get(200));

        // 遍历  先找出键再匹配值

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            String value = map.get(key);
            System.out.println(key + value);
        }

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> entry : entries){
            System.out.println(entry);
        }
    }
}
