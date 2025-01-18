package com.lili;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18,77);
        Student s2 = new Student("李四",20,94);
        Student s3 = new Student("王五",13,65);
        Student s4 = new Student("赵六",25,48);
        Student s5 = new Student("梁七",31,89);
        Student s6 = new Student("胡八",22,97);
        List<Student> list = new ArrayList<>();
        System.out.println(list.add(s1));
        System.out.println(list.add(s2));
        System.out.println(list.add(s3));
        System.out.println(list.add(s4));
        System.out.println(list.add(s5));
        System.out.println(list.add(s6));
        System.out.println(list);

        System.out.println("result = " + getFirstThreeStu(list));
        // result = [Student{name='胡八', age=22, score=97},
        //           Student{name='李四', age=20, score=94},
        //           Student{name='梁七', age=31, score=89}]
    }

    private static List<Student> getFirstThreeStu(List<Student> list) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student student = getNo1Student(list);
            result.add(student);
            list.remove(student);
        }
        return result;
    }

    private static Student getNo1Student(List<Student> list) {
        int maxScore = 0;
        Student result = null;
        for (Student student : list) {
            if (student.getScore() > maxScore) {
                result = student;
                maxScore = student.getScore();
            }
        }
        return result;
    }
}
