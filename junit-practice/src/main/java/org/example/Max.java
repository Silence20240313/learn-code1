package org.example;

import java.util.List;

public class Max {
     public int max(List<Integer> list) {
         int max = 0;
         for (Integer num : list) {
            max = Math.max(max,num);
         }
         return max;
     }
}
