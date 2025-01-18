package com.lili;

public class Day01 {
    public static void main(String[] args){
        //配列を巡回する①
        String[] names = {"桃子","高橋","花子","岩丸"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]); // 桃子 高橋 花子
            if("花子".equals(names[i])) {
                break;
            }
        }

        //配列を巡回する②
        int[] arrs = new int[5];
        int i = 0;
        while(i < arrs.length){
            if(i % 2 == 0) {
                i++;
                continue;
            } else {
                arrs[i] = i + 5;
            }
            System.out.println(arrs[i]); // 6 8
            i++;
        }
    }
}
