package com.lili;

import java.util.ArrayList;
import java.util.List;

public class Day02 {
    public static void main(String[] args){
        String s1 = "张三,李四,王五,赵丰";
        System.out.println(select(s1)); // [张三, 赵丰]

    }

    public static List<String> select(String s){
        String[] names = s.split(",");
        List<String> list = new ArrayList<>();
        for (int i = 0;i < names.length; i++){
            String name = names[i];
            if(name.startsWith("张")||name.endsWith("丰")){
                list.add(name);
            }
        }
        return list;
    }
}
